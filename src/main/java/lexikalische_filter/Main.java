package lexikalische_filter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import vsys.Effect;
import vsys.Result;

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
        String input = "./src/main/java/lexikalische_filter/test.txt";
        Result<Input<Token>> rTokenReader = TokenReader.lexFile(input, SATLexer::new);
        rTokenReader.forEach(rt -> rt.stream().forEach(f));
    }
}
