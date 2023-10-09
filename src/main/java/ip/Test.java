package ip;

import h1.TIMELexer;
import lexikalische_filter.Input;
import lexikalische_filter.TokenReader;
import org.antlr.v4.runtime.Token;
import vsys.Result;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String input = "./src/main/java/ip/test.txt";
        Result<Input<Token>> rTokenReader = TokenReader.lexFile(input, IPLexer::new);
        rTokenReader.forEach(rt -> rt.stream().forEach(t -> {
            if(t.getType() == IPLexer.Interprotokol)
                System.out.printf("IP FOUND %s\n", t.getText());
//            else if (t.getType() == TIMELexer.Hour) {
//                System.out.printf("HOUR FOUND %s\n", t.getText());
//            }
        }));
    }
}

