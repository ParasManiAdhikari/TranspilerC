package h3;

import h3_g6.G6Lexer;
import h3_g6.G6Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class G6Test {
    String expected = "(prog (stat (expr (expr (term (term (term (fact 10)) * (fact 2)) / (fact 2))) + (term (fact 4))) \\n))";
    @ParameterizedTest
    @ValueSource(strings = {"10 * 2 / 2 + 4\n"})
    void g6Test(String input) throws IOException {
        CharStream a = CharStreams.fromString(input);
        G6Lexer lexer = new G6Lexer(a);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        G6Parser parser = new G6Parser(tokens);
        ParseTree tree = parser.prog();
        String actual = tree.toStringTree(parser);
        assertEquals(actual, expected);
    }
}
