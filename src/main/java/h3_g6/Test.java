package h3_g6;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        CharStream a = CharStreams.fromFileName("./src/main/java/h3_g6/test.txt");
        G6Lexer lexer = new G6Lexer(a);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        G6Parser parser = new G6Parser(tokens);
        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));
    }
}
