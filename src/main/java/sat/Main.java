package sat;

import time.TIMELexer;
import org.antlr.v4.runtime.Token;
import script.Effect;
import script.Input;
import script.Result;
import script.TokenReader;

import java.io.IOException;

public class Main {
    private static Effect<Token> f = token -> {
        int line = token.getLine();
        int pos = token.getCharPositionInLine();
        String text = token.getText();
        switch (token.getType()){
            case SATLexer.ITYPE:
                System.out.printf("line %d:%d ma itype dfdsfsf, naam: %s\n", line, pos, text);
        }
    };
    public static void main(String[] args) throws IOException {
        String input = "./src/main/java/sat/test.txt";
        Result<Input<Token>> rTokenReader = TokenReader.lexFile(input, SATLexer::new);
        rTokenReader.forEach(rt -> rt.stream().forEach(f));
    }
}
