package h4;


import h4_calculator.CalculatorLexer;
import h4_calculator.CalculatorParser;
import h4_calculator.EvalVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calcVisitorTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/calcVisitor.csv")
    void calcVisitorTest(String input, int expected) {
        CharStream a = CharStreams.fromString(input);
        CalculatorLexer lexer = new CalculatorLexer(a);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.prog();
        EvalVisitor eval = new EvalVisitor();
        assertEquals(expected, eval.visit(tree));
    }
}
