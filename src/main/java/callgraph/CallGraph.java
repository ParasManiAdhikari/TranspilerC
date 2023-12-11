/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
package callgraph;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.OrderedHashSet;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class CallGraph {
    /** A graph model of the output. Tracks call from one function to
     *  another by mapping function to list of called functions. E.g.,
     *  f -> [g, h]
     *  Can dump DOT two ways (StringBuilder and ST). Sample output:
     digraph G {
     ... setup ...
     f -> g;
     g -> f;
     g -> h;
     h -> h;
     }
     */
    public static class Graph {
        Boolean isEndRekursiv = false;
        Boolean isNichtEntstandig = false;
        Boolean andereNode = false;
        Boolean entstaendigEdge = false;
        Boolean isNichtentstadigEdge = false;
        Boolean andereEdge = false;
        Set<String> endRNodes = new OrderedHashSet<String>(); // list of endstanding nodes
        Set<String> NendRNodes = new OrderedHashSet<String>(); // list of nicht entstandig nodes
        Set<String> AndereNodes = new OrderedHashSet<String>(); // list of andere nodes
        MultiMap<String, String> Eedges = new MultiMap<String, String>();
        MultiMap<String, String> Nedges = new MultiMap<String, String>();
        MultiMap<String, String> AndereEdges = new MultiMap<String, String>();

        public void Eedge(String source, String target) {
            Eedges.map(source, target);
        }

        public void Nedge(String source, String target) {
            Nedges.map(source, target);
        }
        public void AndereEdge(String source, String target) {
            AndereEdges.map(source, target);
        }

        public String toString() {
            return "Endständig Edges: "+ Eedges.toString()+
                    "Nicht Entstanding: "+ Nedges.toString() +
                    "Andere Edges: " + AndereEdges.toString() +
                    ", End Rekursive functions: "+ endRNodes +
                    "\nNicht Endständige Functions: " + NendRNodes +
                    "Andere Nodes: " +  AndereNodes;
        }
        public String toDOT() {
            StringBuilder buf = new StringBuilder();
            buf.append("digraph G {\n");
            buf.append("  ranksep=.25;\n");
            buf.append("  edge [arrowsize=.5]\n");
            buf.append("  node [shape=circle, style=filled, fontname=\"ArialNarrow\",\n");
            buf.append("        fontsize=12, fixedsize=true, height=.45];\n");
            buf.append("  ");
            for (String node : endRNodes) { // print all nodes first
                buf.append(node);
                buf.append("; ");
            }
            for (String node : NendRNodes) { // print all nodes first
                buf.append(node);
                buf.append("; ");
            }
            buf.append("\n");
            for (String src : Eedges.keySet()) {
                for (String trg : Eedges.get(src)) {
                    buf.append("  ");
                    buf.append(src);
                    buf.append(" -> ");
                    buf.append(trg);
                    buf.append(";\n");
                }
            }
            buf.append("\n");
            for (String src : Nedges.keySet()) {
                for (String trg : Nedges.get(src)) {
                    buf.append("  ");
                    buf.append(src);
                    buf.append(" -> ");
                    buf.append(trg);
                    buf.append(";\n");
                }
            }
            buf.append("}\n");
            return buf.toString();
        }

        /** Fill StringTemplate:
         digraph G {
         rankdir=LR;
         <edgePairs:{edge| <edge.a> -> <edge.b>;}; separator="\n">
         <childless:{f | <f>;}; separator="\n">
         }

         Just as an example. Much cleaner than buf.append method
         */
        public ST toST() {
            ST st = new STGroupFile("src/main/resources/stringtemplate/graph.stg").getInstanceOf("digraphTemplate");
            st.add("Eedges", Eedges.getPairs());
            st.add("Nedges", Nedges.getPairs());
            st.add("Aedges", AndereEdges.getPairs());
            st.add("endRNodes", endRNodes);
            st.add("NendRNodes", NendRNodes);
            st.add("ANodes", AndereNodes);
            return st;
        }
    }

    public static class FunctionListener extends CymbolBaseListener {
        public Graph graph = new Graph();
        public String currentFunctionName = null;

        @Override
        public void enterReturn(CymbolParser.ReturnContext ctx) {
            String returnCTX = ctx.getText();
            if (returnCTX.contains(currentFunctionName)) {
                if (returnCTX.contains("return"+currentFunctionName) && ctx.getText().contains(");")) {
                    graph.isEndRekursiv = true;
                    graph.isNichtentstadigEdge = false;
                    graph.andereNode = false;
                } else {
                    graph.isNichtEntstandig = true;
                    graph.isEndRekursiv = false;
                    graph.andereNode = false;
                }
            }
            else if(!graph.isEndRekursiv){
                graph.isNichtEntstandig = false;
                graph.isEndRekursiv = false;
                graph.andereNode = true;
            }
        }

        public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
            currentFunctionName = ctx.ID().getText();
            resetNodes();
            resetEdges();
        }

        @Override
        public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
            if(graph.isEndRekursiv){
                graph.endRNodes.add(currentFunctionName);
            } else if(graph.isNichtEntstandig){
                graph.NendRNodes.add(currentFunctionName);
            } else graph.AndereNodes.add(currentFunctionName);
        }

        private void resetNodes() {
            graph.isEndRekursiv = false;
            graph.isNichtEntstandig = false;
            graph.andereNode = false;
        }

        private void resetEdges() {
            graph.entstaendigEdge = false;
            graph.isNichtentstadigEdge = false;
        }

        public void exitCall(CymbolParser.CallContext ctx) {
            String calledFunction = ctx.ID().getText();
            if (calledFunction.equals(currentFunctionName)) { // select only recursive calls
                if (ctx.getParent().getText().contains("return")) { // select only end-recursive calls
                    graph.entstaendigEdge = true;
                    graph.isNichtentstadigEdge = false;
                } else {
                    graph.isNichtentstadigEdge = true;
                    graph.entstaendigEdge = false;
                }
            }
            else if(ctx.getParent().getText().contains("return"+calledFunction) && ctx.getParent().getText().contains(");")){
                graph.entstaendigEdge = true;
                graph.isNichtentstadigEdge = false;
            }
            if(graph.entstaendigEdge){
                graph.Eedge(currentFunctionName, calledFunction);
            } else if (graph.isNichtentstadigEdge) {
                graph.Nedge(currentFunctionName, calledFunction);
            } else graph.AndereEdge(currentFunctionName, calledFunction);
        }
    }

    public static void main(String[] args) throws Exception {
//        CharStream input = CharStreams.fromString("int fib(int n) {\n" +
//                "  if (n==0) return 0;\n" +
//                "  if (n==1) return 1;\n" +
//                "  return (fib(n-1) + fib(n-2));\n" +
//                "}");
        CharStream input = CharStreams.fromFileName("src/main/resources/rec.cymbol");
        CymbolLexer lexer = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser parser = new CymbolParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();
        // show tree in text form
        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        FunctionListener collector = new FunctionListener();
        walker.walk(collector, tree);
//        System.out.println(collector.graph.toString());
//        System.out.println(collector.graph.toDOT());

        // Here's another example that uses StringTemplate to generate output
        String inputString = collector.graph.toST().render();
        System.out.println(inputString);
        try {
            String inputFilePath = "photo.gv";
            File f = new File(inputFilePath);
            FileWriter writer = new FileWriter(f.getName());
            writer.write(inputString);
            writer.close();
            createPNG(inputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createPNG(String inputFilePath) throws Exception {
        String outputFilePath = "photo.png";
        ProcessBuilder processBuilder = new ProcessBuilder("dot", "-Tpng", inputFilePath, "-o", outputFilePath);
        processBuilder.redirectErrorStream(true);
        Process process = processBuilder.start();
        int exitCode = process.waitFor();
        if (exitCode == 0) {
            System.out.println("PNG file generated successfully.");
        } else {
            System.err.println("Error generating PNG file. Exit code: " + exitCode);
        }
    }
}
