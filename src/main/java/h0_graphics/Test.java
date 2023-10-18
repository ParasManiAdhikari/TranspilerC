package h0_graphics;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("./src/main/java/h0_graphics/test.txt");
        GraphicsLexer lexer = new GraphicsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GraphicsParser parser = new GraphicsParser(tokens);
        parser.file();
    }
}
