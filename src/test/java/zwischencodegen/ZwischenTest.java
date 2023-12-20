package zwischencodegen;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import zwischencode.DefPhase;
import zwischencode.Listener;
import zwischencode.StackInterpreter.Interpreter;
import zwischencodeGENERATED.CymbolLexer;
import zwischencodeGENERATED.CymbolParser;

import java.io.IOException;
import java.util.List;

public class ZwischenTest {
    @ParameterizedTest
    @CsvSource({
            "'src/main/resources/CymbolProgs/evenodd.cymbol.c', '1,0,0,1'",
            "'src/main/resources/CymbolProgs/fact.cymbol.c', '6'",
            "'src/main/resources/CymbolProgs/fib.cymbol.c', '5'",
            "'src/main/resources/CymbolProgs/for.cymbol.c', '8'",
            "'src/main/resources/CymbolProgs/funcCall.cymbol.c', '30'",
            "'src/main/resources/CymbolProgs/ifElse.cymbol.c', '1'",
            "'src/main/resources/CymbolProgs/ifgt.cymbol.c', '1'",
            "'src/main/resources/CymbolProgs/iflt.cymbol.c', '1'",
            "'src/main/resources/CymbolProgs/ifTrueFalse.cymbol.c', '1'",
            "'src/main/resources/CymbolProgs/neq.cymbol.c', '1'",
            "'src/main/resources/CymbolProgs/printf.cymbol.c', '7'",
            "'src/main/resources/CymbolProgs/printf.cymbol.c', '7'",
            "'src/main/resources/CymbolProgs/uebungA.cymbol.c', '-173'",
            "'src/main/resources/CymbolProgs/uminus.cymbol.c', '-3'",
            "'src/main/resources/CymbolProgs/while.cymbol.c', '8'",
            "'src/main/resources/CymbolProgs/whileTwice.cymbol.c','64'",
    })
    void pcodeTranslationTest(String input, String result) throws Exception {
        String translation = translateToPCode(input);
        System.out.println(translation);
        List<String> resFromTranslation = Interpreter.runString(translation);
        StringBuilder resultsFromTranslation = new StringBuilder();
        for (int i = 0; i < resFromTranslation.size(); i++) {
            if (i > 0) resultsFromTranslation.append(',');
            resultsFromTranslation.append(resFromTranslation.get(i));
        }
        System.out.println("translation: " +resultsFromTranslation);
        Assertions.assertEquals(result, resultsFromTranslation.toString());
    }

    private String translateToPCode(String path) throws IOException {
        CharStream cs = CharStreams.fromFileName(path);
        CymbolLexer lexer = new CymbolLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser parser = new CymbolParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();

        ParseTreeWalker walker = new ParseTreeWalker();
        DefPhase def = new DefPhase();
        walker.walk(def, tree);
        // create zwischencode using defphase
        Listener gen = new Listener(def.globals, def.scopes);
        walker.walk(gen, tree);
        String result = gen.result.render();
        return result;
    }
}
