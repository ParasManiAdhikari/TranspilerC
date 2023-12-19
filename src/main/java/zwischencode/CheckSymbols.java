/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
package zwischencode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import zwischencode.StackInterpreter.Interpreter;
import zwischencodeGENERATED.*;

import java.util.List;

public class CheckSymbols {
    public static Symbol.Type getType(int tokenType) {
        switch ( tokenType ) {
            case CymbolParser.K_VOID :  return Symbol.Type.tVOID;
            case CymbolParser.K_INT :   return Symbol.Type.tINT;
            case CymbolParser.K_FLOAT : return Symbol.Type.tFLOAT;
        }
        return Symbol.Type.tINVALID;
    }

    public static void error(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(),
                msg);
    }

    public String process(CharStream args) throws Exception {
        CymbolLexer lexer = new CymbolLexer(args);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser parser = new CymbolParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();

        ParseTreeWalker walker = new ParseTreeWalker();
        DefPhase def = new DefPhase();
        walker.walk(def, tree);
        // create zwischencode using defphase
        zwischencodegeneratePhase gen = new zwischencodegeneratePhase(def.globals, def.scopes);
        walker.walk(gen, tree);
        String result = gen.result.render();
        return result;
    }

    public static void main(String[] args) throws Exception {
        run("src/main/resources/CymbolProgs/ifElse.cymbol.c");
    }

    public static String run (String path) throws Exception {
        String p = "src/main/resources/CymbolProgs/fact.cymbol.c";
        CharStream cs = CharStreams.fromFileName(path);
        String pcode = new CheckSymbols().process(cs);
        System.out.println(pcode);
        System.out.println("INTERPRETER _...................");

        List<String> ans = Interpreter.runString(pcode);
        System.out.println(ans);
        return pcode;
    }
}
