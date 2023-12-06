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
import script.Tuple;
import java.io.*;
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
        // I'm using org.antlr.v4.runtime.misc: OrderedHashSet, MultiMap
        Set<Tuple<String, String>> nodes = new OrderedHashSet<>(); // list of functions
        MultiMap<String, Tuple<String, String>> edges =                  // caller->callee
                new MultiMap<>();

        String nodeColor = "[fillcolor=white]"; // Default function declaration color: white
        String edgeColor = "[color=black]"; // Default function call color: black

        public void edge(String source, Tuple<String, String> target) {
            edges.map(source, target);
        }
        public String toString() {
            return "edges: "+edges.toString()+", functions: "+ nodes;
        }
        public String toDOT() {
            StringBuilder buf = new StringBuilder();
            buf.append("digraph G {\n");
            buf.append("  ranksep=.25;\n");
            buf.append("  edge [arrowsize=.5]\n");
            buf.append("  node [shape=circle, style=filled, fontname=\"ArialNarrow\",\n");
            buf.append("        fontsize=12, fixedsize=true, height=.45];\n");
            buf.append("  ");
            for (Tuple<String, String> node : nodes) { // print all nodes first
                buf.append(node.fst);
                buf.append(node.snd);
                buf.append("; ");
            }
            buf.append("\n");
            for (String src : edges.keySet()) {
                for (Tuple<String, String> trg : edges.get(src)) {
                    buf.append("  ");
                    buf.append(src);
                    buf.append(" -> ");
                    buf.append(trg.fst);
                    buf.append(" ");
                    buf.append(trg.snd);
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
            st.add("edgePairs", edges.getPairs());
            st.add("funcs", nodes);
            return st;
        }
    }

    public static class FunctionListener extends CymbolBaseListener {
        public Graph graph = new Graph();
        public String currentFunctionName = null;

        @Override
        public void enterReturn(CymbolParser.ReturnContext ctx) {
            if (ctx.getText().contains(currentFunctionName)) { // select only recursive calls
                // select only end-recursive calls
                if (ctx.getText().contains("return"+currentFunctionName) && ctx.getText().contains(");")) {
                    graph.nodeColor = "[fillcolor=green]";
                } else {
                    graph.nodeColor = "[fillcolor=red]";
                }
            }
        }

        public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
            currentFunctionName = ctx.ID().getText();
        }
        @Override
        public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
            graph.nodes.add(new Tuple<>(currentFunctionName, graph.nodeColor));
            graph.nodeColor = "[fillcolor=white]";
        }

        public void exitCall(CymbolParser.CallContext ctx) {
            String funcName = ctx.ID().getText();
            if (funcName.equals(currentFunctionName)) { // select only recursive calls
                if (ctx.getParent().getText().contains("return")) { // select only end-recursive calls
                    graph.edgeColor = "[color=green]";
                } else {
                    graph.edgeColor = "[color=red]";
                }
            }
            graph.edge(currentFunctionName, new Tuple<>(funcName, graph.edgeColor));
            graph.edgeColor = "[color=black]";
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
            String inputFilePath = "graph.gv";
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
        String outputFilePath = "output.png";
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
