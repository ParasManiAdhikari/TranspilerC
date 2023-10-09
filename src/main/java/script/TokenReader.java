package script;

import org.antlr.v4.runtime.*;

import java.io.IOException;

public class TokenReader implements Input<Token> {
    private Lexer lexer;
    private TokenReader(Lexer lexer){
        this.lexer = lexer;
    }
    public static Input<Token> tokenReader(Lexer lexer){
        return new TokenReader(lexer);
    }
    public static Result<Input<Token>> lexFile(String filename, Function<CharStream,Lexer> lexer){
        try {
            CharStream input = CharStreams.fromFileName(filename);
            return Result.success(new TokenReader(lexer.apply(input)));
        } catch (IOException e) {
            return Result.failure("Error reading the file: " + e.getMessage());
        }
        //return Result.of(() -> new TokenReader(lexer.apply(CharStreams.fromFileName(filename))));
    }
    @Override
    public Result<Tuple<Token, Input<Token>>> read() {
        Token t = lexer.nextToken();
        return t.getType() == Token.EOF
                ? Result.empty()
                : Result.success(new Tuple<>(t,this));
    }

    @Override
    public void close() throws Exception {

    }
}