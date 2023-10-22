package h1;

import h1_ip.IPLexer;
import org.antlr.v4.runtime.Token;
import org.junit.jupiter.api.Test;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import script.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IPTest {
    static final Function<Token, Function<Supplier<ST>, ST>> f = token -> supplier -> supplier.get().add("tokens", token);

    @Test
    void test() {
        List<String> expected = List.of(
                "24.24.24.50",
                "24.24.24.24"
        );

        STGroup templates = new STGroupFile("src/main/resources/stringtemplate/template.stg");
        String input = "./src/main/java/h1_ip/test.txt";
        Result<Input<Token>> rTokenReader = TokenReader.lexFile(input, IPLexer::new);

        Result<ST> rst = rTokenReader.map(tr -> tr.stream()
                .foldRight(
                        () -> templates.getInstanceOf("lexFilter"), f
                )
        );

        rst.forEachOrThrow((st) -> assertEquals(String.join(System.lineSeparator(), expected), st.render().trim()));
    }
}
