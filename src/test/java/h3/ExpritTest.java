package h3;

import h3_exprit.ExpritLexer;
import h3_exprit.ExpritParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpritTest {
    String expected = "(prog (stat (expr (term (fact 10) * (fact 2) / (fact 2)) + (term (fact 4))) \\n))";
    @ParameterizedTest
    @ValueSource(strings = {"10 * 2 / 2 + 4\n"})
    void g6Test(String input) throws IOException {
        CharStream a = CharStreams.fromString(input);
        ExpritLexer lexer = new ExpritLexer(a);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpritParser parser = new ExpritParser(tokens);
        ParseTree tree = parser.prog();
        String actual = tree.toStringTree(parser);
        assertEquals(actual, expected);
    }
}
