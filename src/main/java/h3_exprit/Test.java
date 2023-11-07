package h3_exprit;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        CharStream a = CharStreams.fromFileName("./src/main/java/h3_g6/test.txt");
        ExpritLexer lexer = new ExpritLexer(a);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpritParser parser = new ExpritParser(tokens);
        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));
    }
}

// (prog (stat (expr (term (fact 10) * (fact 2) / (fact 2)) + (term (fact 4))) \r\n))