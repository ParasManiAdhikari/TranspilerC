package h4;


import h4_calcV.CalculatorVLexer;
import h4_calcV.CalculatorVParser;
import h4_calcV.EvalVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcVisitor {

    String expected = "20";
    @ParameterizedTest
    @ValueSource(strings = {"a = 3\n"})
    void test(String input) throws IOException {
        CharStream a = CharStreams.fromString(input);
        CalculatorVLexer lexer = new CalculatorVLexer(a);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorVParser parser = new CalculatorVParser(tokens);
        ParseTree tree = parser.prog();
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
