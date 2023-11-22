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
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calcListenerTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/calcListener.csv")
    void calcListenerTest(String input, int expected) {
        CharStream a = CharStreams.fromString(input);
        CalculatorLexer lexer = new CalculatorLexer(a);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.stat();

        ParseTreeWalker walker = new ParseTreeWalker();
        EvalListener evalList = new EvalListener();
        walker.walk(evalList, tree);
        assertEquals(expected, evalList.getValue(tree.getChild(0)));
    }
}
