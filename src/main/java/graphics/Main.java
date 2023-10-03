package graphics;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("./src/main/java/graphics/test.txt");
        GraphicsLexer lexer = new GraphicsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GraphicsParser parser = new GraphicsParser(tokens);
    }
}
