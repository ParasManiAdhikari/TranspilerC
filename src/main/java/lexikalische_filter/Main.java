package lexikalische_filter;

import h1.TIMELexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
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
        String input = "./src/main/java/h1/test.txt";
        Result<Input<Token>> rTokenReader = TokenReader.lexFile(input, TIMELexer::new);
        rTokenReader.forEach(rt -> rt.stream().forEach(f));
    }
}
