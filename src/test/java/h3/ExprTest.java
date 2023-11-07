package h3;

import h3_expr.ExprLexer;
import h3_expr.ExprParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExprTest {
    String expected = "(prog (stat (expr (expr (expr 10) * (expr 2)) / (expr (expr 2) + (expr 4))) \\n))";

    @ParameterizedTest
    @ValueSource(strings = {"10 * 2 / 2 + 4\n"})
    void exprTest(String input) throws IOException {
        CharStream a = CharStreams.fromString(input);
        ExprLexer lexer = new ExprLexer(a);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.prog();
        String actual = tree.toStringTree(parser);
        assertEquals(actual, expected);
    }

}
