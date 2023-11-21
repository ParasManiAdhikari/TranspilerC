package h4;

import h4_calcGA.CalculatorGALexer;
import h4_calcGA.CalculatorGAParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.antlr.v4.runtime.CharStreams.fromString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calcGATest {
    @ParameterizedTest
    @CsvFileSource(resources = "/calcGA.csv")
    void testWithoutParseTree(String input, String expected) {
        CalculatorGAParser parser = new CalculatorGAParser(null);
        parser.setBuildParseTree(false);
        CharStream cs = fromString(input);
        CalculatorGALexer lexer = new CalculatorGALexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser.setInputStream(tokens);
        assertEquals(expected, String.valueOf(parser.stat().expr.v));
    }
}
