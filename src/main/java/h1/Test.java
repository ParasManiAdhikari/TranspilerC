package h1;
import lexikalische_filter.Input;
import lexikalische_filter.TokenReader;
import org.antlr.v4.runtime.Token;
import vsys.Result;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String input = "./src/main/java/h1/test.txt";
        Result<Input<Token>> rTokenReader = TokenReader.lexFile(input, TIMELexer::new);
        rTokenReader.forEach(rt -> rt.stream().forEach(t -> {
            if(t.getType() == TIMELexer.TIME)
            System.out.printf("TIME FOUND %s\n", t.getText());
            else if (t.getType() == TIMELexer.Hour) {
                System.out.printf("HOUR FOUND %s\n", t.getText());
            }
        }));
    }
}
