package dsl;

import DSL.Services.CSVLoader;
import DSL.Services.LexAnalysator;
import DSL.CSVLexer;
import DSL.CSVParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;


public class ServicesTest {

    private static String sucess = "Sucess";

    @DataPoint
    public static List<String> Sucess = Arrays.asList("1", "1", "0", "0");


    @Test
    public void csvTest() throws Exception {
        InputStream is = new FileInputStream("src/main/java/DSL/Services/automat.csv");
        CSVLexer lexer = new CSVLexer( new ANTLRInputStream(is) );
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSVParser parser = new CSVParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();

        ParseTreeWalker walker = new ParseTreeWalker();
        CSVLoader loader = new CSVLoader();
        walker.walk(loader, tree);

        LexAnalysator lexAnalysator = new LexAnalysator();
        String result = lexAnalysator.automat(Sucess, loader.table);
        Assert.assertEquals(result, sucess);
    }
}