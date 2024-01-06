package zwischencodegen;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import zwischencode.CymbolLexer;
import zwischencode.CymbolParser;
import zwischencode.DefPhase;
import zwischencode.Listener;
import zwischencode.StackInterpreter.Interpreter;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CymbolTest {
    @ParameterizedTest
    @CsvSource({"src/main/resources/CymbolProgs/for.cymbol.c,8",
            "src/main/resources/CymbolProgs/fib.cymbol.c,5",
            "src/main/resources/CymbolProgs/fact.cymbol.c,6",
            "src/main/resources/CymbolProgs/evenodd.cymbol.c, '1001'",
            "src/main/resources/CymbolProgs/for.cymbol.c,8",
            "src/main/resources/CymbolProgs/funcCall.cymbol.c,30",
            "src/main/resources/CymbolProgs/ifElse.cymbol.c,1",
            "src/main/resources/CymbolProgs/ifgt.cymbol.c,1",
            "src/main/resources/CymbolProgs/iflt.cymbol.c,1",
            "src/main/resources/CymbolProgs/ifTrueFalse.cymbol.c,1",
            "src/main/resources/CymbolProgs/max.cymbol.c,5",
            "src/main/resources/CymbolProgs/rec.cymbol.c,245126191",
            "src/main/resources/CymbolProgs/sum.cymbol.c,2121",
            "src/main/resources/CymbolProgs/uebungA.cymbol.c,-173",
            "src/main/resources/CymbolProgs/uminus.cymbol.c,-3",
            "src/main/resources/CymbolProgs/neq.cymbol.c,1",
            "src/main/resources/CymbolProgs/not.cymbol.c,4",
            "src/main/resources/CymbolProgs/printf.cymbol.c,7",
            "src/main/resources/CymbolProgs/patternS261.cymbol.c,'30'",
            "src/main/resources/CymbolProgs/whileTwice.cymbol.c,64",
            "src/main/resources/CymbolProgs/while.cymbol.c,8"})

    public void test(String filename, String actual) throws Exception {
        String pcode = getPcode(filename);
        System.out.println(pcode);
        String result = Interpreter.run2(pcode);
        String expected = result.replaceAll("\r\n|\r|\n", "");
        if (actual.equals("empty")) {
            actual = "";
        }
        assertEquals(actual, expected);
    }

    public static String getPcode(String filename) throws IOException {
        CharStream input = CharStreams.fromFileName(filename);
        CymbolLexer lexer = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser parser = new CymbolParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();
        ParseTreeWalker walker = new ParseTreeWalker();
        DefPhase def = new DefPhase();
        walker.walk(def, tree);
        Listener ref = new Listener(def.globalscope);
        walker.walk(ref, tree);
        return ref.getCode(tree).render().trim();
    }
}
