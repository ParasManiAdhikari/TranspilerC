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

    String expected = "  digraph G {\r\n" +
            "    ranksep=.25; \r\n" +
            "    edge [arrowsize=.5]\r\n" +
            "    node [shape=circle, style=filled, fontname=\"ArialNarrow\",\r\n" +
            "          fontsize=12, fixedsize=true, height=.45];\r\n" +
            "    add [fillcolor=green]; add2 [fillcolor=green]; ggT [fillcolor=green]; mcCarthy [fillcolor=green]; ackermann [fillcolor=green]; \r\n" +
            "    sum [fillcolor=red]; sum2 [fillcolor=red]; fact [fillcolor=red]; fib [fillcolor=red]; \r\n" +
            "    main [fillcolor=white]; identity [fillcolor=white]; binomi [fillcolor=white]; kgV [fillcolor=white]; \r\n" +
            "    add -> identity [color=green]; \r\n" +
            "    add -> add [color=green]; \r\n" +
            "    add2 -> add2 [color=green]; \r\n" +
            "    add2 -> identity [color=green]; \r\n" +
            "    sum -> add [color=green]; \r\n" +
            "    sum2 -> add2 [color=green]; \r\n" +
            "    ggT -> ggT [color=green]; \r\n" +
            "    ggT -> ggT [color=green]; \r\n" +
            "    mcCarthy -> mcCarthy [color=green]; \r\n" +
            "    ackermann -> ackermann [color=green]; \r\n" +
            "    ackermann -> ackermann [color=green]; \r\n" +
            "    sum -> sum [color=red]; \r\n" +
            "    sum2 -> sum2 [color=red]; \r\n" +
            "    fact -> fact [color=red]; \r\n" +
            "    fib -> fib [color=red]; \r\n" +
            "    fib -> fib [color=red]; \r\n" +
            "    mcCarthy -> mcCarthy [color=red]; \r\n" +
            "    ackermann -> ackermann [color=red]; \r\n" +
            "    main -> sum [color=black]; \r\n" +
            "    main -> sum2 [color=black]; \r\n" +
            "    main -> binomi [color=black]; \r\n" +
            "    main -> fib [color=black]; \r\n" +
            "    main -> kgV [color=black]; \r\n" +
            "    main -> ackermann [color=black]; \r\n" +
            "    main -> mcCarthy [color=black]; \r\n" +
            "    binomi -> fact [color=black]; \r\n" +
            "    binomi -> fact [color=black]; \r\n" +
            "    binomi -> fact [color=black]; \r\n" +
            "    kgV -> ggT [color=black]; \r\n" +
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
