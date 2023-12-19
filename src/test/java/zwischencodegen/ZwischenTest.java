package zwischencodegen;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import zwischencode.CheckSymbols;
import zwischencode.StackInterpreter.Interpreter;

import java.util.List;

public class ZwischenTest {
    @ParameterizedTest
    @CsvSource({
            "'src/main/resources/CymbolProgs/fact.cymbol.c', '6'",
            "'src/main/resources/CymbolProgs/ifElse.cymbol.c', '1'",
            "'src/main/resources/CymbolProgs/ifgt.cymbol.c', '1'",
            "'src/main/resources/CymbolProgs/rec.cymbol.c', '24,5,12,61,91'"
    })
    void pcodeTranslationTest(String input, String result) throws Exception {
        String translation = CheckSymbols.run(input);
//        System.out.println(translation);
        List<String> resFromTranslation = Interpreter.runString(translation);
        StringBuilder resultsFromTranslation = new StringBuilder();
        for (int i = 0; i < resFromTranslation.size(); i++) {
            if (i > 0) resultsFromTranslation.append(',');
            resultsFromTranslation.append(resFromTranslation.get(i));
        }
//        System.out.println("path: " + input);
        System.out.println("translation:\n" +resultsFromTranslation);
//        System.out.println("res:\n" +result);
        System.out.println("ANSWER");
        System.out.println(resultsFromTranslation.toString().equals(result));
//        Assertions.assertEquals(resultsFromTranslation.toString(), result);
    }
}
