package h5;

import callgraph.CallGraph.*;
import callgraph.CymbolLexer;
import callgraph.CymbolParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CallgraphTest {

    String expected = "  digraph G {\n" +
            "    ranksep=.25; \n" +
            "    edge [arrowsize=.5]\n" +
            "    node [shape=circle, style=filled, fontname=\"ArialNarrow\",\n" +
            "          fontsize=12, fixedsize=true, height=.45];\n" +
            "    add [fillcolor=green]; add2 [fillcolor=green]; ggT [fillcolor=green]; mcCarthy [fillcolor=green]; ackermann [fillcolor=green]; \n" +
            "    sum [fillcolor=red]; sum2 [fillcolor=red]; fact [fillcolor=red]; fib [fillcolor=red]; \n" +
            "    main [fillcolor=white]; identity [fillcolor=white]; binomi [fillcolor=white]; kgV [fillcolor=white]; \n" +
            "    add -> identity [color=green]; \n" +
            "    add -> add [color=green]; \n" +
            "    add2 -> add2 [color=green]; \n" +
            "    add2 -> identity [color=green]; \n" +
            "    sum -> add [color=green]; \n" +
            "    sum2 -> add2 [color=green]; \n" +
            "    ggT -> ggT [color=green]; \n" +
            "    ggT -> ggT [color=green]; \n" +
            "    mcCarthy -> mcCarthy [color=green]; \n" +
            "    ackermann -> ackermann [color=green]; \n" +
            "    ackermann -> ackermann [color=green]; \n" +
            "    sum -> sum [color=red]; \n" +
            "    sum2 -> sum2 [color=red]; \n" +
            "    fact -> fact [color=red]; \n" +
            "    fib -> fib [color=red]; \n" +
            "    fib -> fib [color=red]; \n" +
            "    mcCarthy -> mcCarthy [color=red]; \n" +
            "    ackermann -> ackermann [color=red]; \n" +
            "    main -> sum [color=black]; \n" +
            "    main -> sum2 [color=black]; \n" +
            "    main -> binomi [color=black]; \n" +
            "    main -> fib [color=black]; \n" +
            "    main -> kgV [color=black]; \n" +
            "    main -> ackermann [color=black]; \n" +
            "    main -> mcCarthy [color=black]; \n" +
            "    binomi -> fact [color=black]; \n" +
            "    binomi -> fact [color=black]; \n" +
            "    binomi -> fact [color=black]; \n" +
            "    kgV -> ggT [color=black]; \n" +
            "  }";

    @Test
    void callGraphTest() throws IOException {
        CharStream input = CharStreams.fromFileName("src/main/resources/rec.cymbol");
        CymbolLexer lexer = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser parser = new CymbolParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();
        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        FunctionListener collector = new FunctionListener();
        walker.walk(collector, tree);
//        String actual = collector.graph.toDOT();

        // String Template
        String actual = collector.graph.toST().render();

        assertEquals(expected, actual);
    }
}
