package hello;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        CharStream a = CharStreams.fromFileName("./src/main/java/hello/test.txt");
        HelloLexer lexer = new HelloLexer(a);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokens);
        ParseTree tree = parser.r();
        System.out.println(tree.toStringTree(parser));
    }
}
