package h4;


import h4_calculator.CalculatorLexer;
import h4_calculator.CalculatorParser;
import h4_calculator.EvalListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calcListenerTest {

    String expected = "20";
    @ParameterizedTest
    @ValueSource(strings = {"2 ^ 5\n"})
    void test(String input) {
        CharStream a = CharStreams.fromString(input);
        CalculatorLexer lexer = new CalculatorLexer(a);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.stat();

        ParseTreeWalker walker = new ParseTreeWalker();
        EvalListener evalList = new EvalListener();
        walker.walk(evalList, tree);
        System.out.println(tree.toStringTree(parser));
        System.out.println(evalList.getValue(tree.getChild(0)));
    }
}