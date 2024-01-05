package zwischencode;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import zwischencode.StackInterpreter.Interpreter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Listener extends CymbolBaseListener {

    public final STGroup templates = new STGroupFile("src/main/resources/cymbol.stg");
    GlobalScope globalscope;
    private String currentFunctionName;
    private List<String> currentFunctionParameters;

    public int index;
    public Listener(GlobalScope globalscope) {
        this.globalscope = globalscope;
        this.index = 0;
        this.currentFunctionName = null;
        this.currentFunctionParameters = new ArrayList<>();
    }

    public int getIndex() {
        this.index++;
        return index;
    }

    ParseTreeProperty<Integer> numArgs = new ParseTreeProperty<>();
    ParseTreeProperty<Integer> numLocals = new ParseTreeProperty<>();

    // arguments and locals
    public void setNumArgs(ParseTree node, int value) {
        numArgs.put(node, value);
    }

    public int getNumArgs(ParseTree node) {
        return numArgs.get(node);
    }

    public void setNumLocals(ParseTree node, int value) {
        numLocals.put(node, value);
    }

    public int getNumLocals(ParseTree node) {
        return numLocals.get(node);
    }

    ParseTreeProperty<BLabel> bWert = new ParseTreeProperty<BLabel>();
    public void setBWert(ParseTree node, BLabel value) { bWert.put(node, value); }
    public BLabel getBWert(ParseTree node) { return bWert.get(node); }
    ParseTreeProperty<ST> code = new ParseTreeProperty<ST>();
    public void setCode(ParseTree node, ST value) { code.put(node, value); }
    public ST getCode(ParseTree node) { return code.get(node); }
    public void exitFile(CymbolParser.FileContext ctx) {
        ST result = templates.getInstanceOf("file");
        result.add("num",globalscope.symbols.size());
        int len = ctx.functionDecl().size();
        for (int i = 0; i < len; i++) {
            result.add("function",getCode(ctx.functionDecl(i)));
        }
        setCode(ctx,result);
    }

    public void enterFormalParameter(CymbolParser.FormalParameterContext ctx) {
        // Add the parameter name to the current function parameters list
        currentFunctionParameters.add(ctx.ID().getText());
    }

    public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        setNumArgs(ctx, ctx.formalParameters() != null ? ctx.formalParameters().formalParameter().size() : 0);
        setNumLocals(ctx, 0); // Initialize locals to 0; you will need to update this if you support local variables
        currentFunctionName = ctx.ID().getText();
        currentFunctionParameters.clear();
    }

    public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        // Add function to the symbol table
        if (currentFunctionName != null) {
            // Clear current function information for the next function
            currentFunctionName = null;
            currentFunctionParameters.clear();
        }

        ST block = getCode(ctx.block());
        int numArgs = getNumArgs(ctx);
        int numLocals = getNumLocals(ctx);

        ST result;
        if (ctx.ID().getText().equals("main")) {
            result = templates.getInstanceOf("functionMain")
                    .add("name",ctx.ID().getText())
                    .add("args", numArgs)
                    .add("locals", numLocals)
                    .add("block",block);
        } else {
            result = templates.getInstanceOf("function")
                    .add("name",ctx.ID().getText())
                    .add("args", numArgs)
                    .add("locals", numLocals)
                    .add("block",block);

        }
        setCode(ctx,result);

    }
    public void exitVarDecl(CymbolParser.VarDeclContext ctx) {
        ST result = templates.getInstanceOf("empty");
        setCode(ctx,result);
    }
    public void exitBlock(CymbolParser.BlockContext ctx) {
        int len = ctx.stat().size();
        ST result = templates.getInstanceOf("block");
        for (int i = 0; i < len; i++) {
            result.add("value",getCode(ctx.stat(i)));
        }
        setCode(ctx,result);
    }

    public void exitIfStat(CymbolParser.IfStatContext ctx) {
        // the labels for the Boolean expression
        String bTrue = getBWert(ctx.bexpr()).getbTrue();
        String bFalse = getBWert(ctx.bexpr()).getbFalse();
        int len = ctx.stat().size();
        // den booleschen Ausdruck mit den Sprüngen
        ST bexpr = getCode(ctx.bexpr());
        ST result;
        ST stat1 = getCode(ctx.stat(0));
        // check whether it is ifelse
        if (len > 1) {
            String bNext = "bNext" + getBWert(ctx.bexpr()).getIndex();
            ST stat2 = getCode(ctx.stat(1));
            // unconditional jumps to the end if True off was evaluated
            ST bNextCode = templates.getInstanceOf("trueFalse").add("value",bNext);
            result = templates.getInstanceOf("ifElse").add("be",bexpr).add("stat1",stat1).add("stat2",stat2).add("bTrue",bTrue).add("bFalse",bFalse).add("bNextCode",bNextCode).add("bNext",bNext);
        } else {
            result = templates.getInstanceOf("if").add("be",bexpr).add("stat",stat1).add("bTrue",bTrue).add("bFalse",bFalse);

        }
        setCode(ctx,result);
    }

    public void exitForStat(CymbolParser.ForStatContext ctx) {
        String bTrue = getBWert(ctx.bexpr()).getbTrue();
        String bFalse = getBWert(ctx.bexpr()).getbFalse();
        String begin = "begin" + getBWert(ctx.bexpr()).getIndex();
        ST bexpr = getCode(ctx.bexpr());
        ST stat = getCode(ctx.stat());
        ST assign1 = getCode(ctx.assignStat(0));
        ST assign2 = getCode(ctx.assignStat(1));
        ST beginCode = templates.getInstanceOf("trueFalse").add("value",begin);

        ST result = templates.getInstanceOf("for");
        result.add("assign1",assign1).add("begin",begin).add("be",bexpr).add("bTrue",bTrue);
        result.add("stat",stat).add("assign2",assign2).add("beginCode",beginCode).add("bFalse",bFalse);
        setCode(ctx,result);

    }
    public void exitWhileStat(CymbolParser.WhileStatContext ctx) {

        String bTrue = getBWert(ctx.bexpr()).getbTrue();
        String bFalse = getBWert(ctx.bexpr()).getbFalse();
        String begin = "begin" + getBWert(ctx.bexpr()).getIndex();
        ST bexpr = getCode(ctx.bexpr());
        ST stat = getCode(ctx.stat());
        ST beginCode = templates.getInstanceOf("trueFalse").add("value",begin);

        ST result = templates.getInstanceOf("while");
        result.add("begin",begin).add("be",bexpr).add("bTrue",bTrue).add("beginCode",beginCode).add("bFalse",bFalse).add("stat",stat);
        setCode(ctx,result);
    }
    public void exitReturnStat(CymbolParser.ReturnStatContext ctx) {
        ST expr = getCode(ctx.expr());
        ST result = templates.getInstanceOf("return").add("e",expr);
        setCode(ctx,result);

    }

    public void exitAssignStat(CymbolParser.AssignStatContext ctx) {
        String name = ctx.ID().getText();
        ST expr = getCode(ctx.expr());
        //int var;
        int var = globalscope.resolve(name).getIndex();
        ST result = templates.getInstanceOf("gstore").add("v",var).add("e",expr);
        setCode(ctx,result);

    }
    public void exitPrintStat(CymbolParser.PrintStatContext ctx) {
        ST expr = getCode(ctx.expr());
        ST result = templates.getInstanceOf("print").add("e",expr);
        setCode(ctx,result);
    }
    public void exitNegate(CymbolParser.NegateContext ctx) {
        ST left = getCode(ctx.expr());
        String intText = "-1";
        ST right = templates.getInstanceOf("const").add("val",intText);
        ST result = templates.getInstanceOf("mul").add("e1",left).add("e2",right);
        setCode(ctx,result);
    }

    public void exitMulDiv(CymbolParser.MulDivContext ctx) {
        ST left = getCode(ctx.expr(0));
        ST right = getCode(ctx.expr(1));
        if ( ctx.op.getType() == CymbolParser.MUL ){
            ST result = templates.getInstanceOf("mul").add("e1",left).add("e2",right);
            setCode(ctx,result);
        }
    }
    public void exitAddSub(CymbolParser.AddSubContext ctx) {
        ST left = getCode(ctx.expr(0));
        ST right = getCode(ctx.expr(1));
        ST result;
        if ( ctx.op.getType() == CymbolParser.ADD ){
            result = templates.getInstanceOf("add").add("e1",left).add("e2",right);
        } else {
            result = templates.getInstanceOf("sub").add("e1",left).add("e2",right);
        }

        setCode(ctx,result);
    }


    public void exitVar(CymbolParser.VarContext ctx) {
        String name = ctx.ID().getSymbol().getText();

        if (currentFunctionParameters.contains(name)) {
            // If the variable is a function parameter, generate code to load the parameter
            int paramIndex = currentFunctionParameters.indexOf(name);
            ST result = templates.getInstanceOf("loadParam").add("paramIndex", paramIndex);
            setCode(ctx, result);
        } else {
            // If the variable is a regular variable, generate code to load the variable
            Symbol variable = globalscope.resolve(name);

            if (variable == null) {
                System.out.println("no variable with this name: " + name);
            } else {
                ST result = templates.getInstanceOf("varRef").add("v", variable.getIndex());
                setCode(ctx, result);
            }
        }
    }

    public void exitInt(CymbolParser.IntContext ctx) {
        String intText = ctx.INT().getText();
        ST result = templates.getInstanceOf("const").add("val",intText);
        setCode(ctx,result);
    }

    public void exitParens(CymbolParser.ParensContext ctx) {
        setCode(ctx,getCode(ctx.expr()));
    }
    public void exitCall(CymbolParser.CallContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol func = globalscope.resolve(name);
        if (func == null || func instanceof VariableSymbol) {
            System.out.println("no such function: "+name);
        } else {
            ST answer = templates.getInstanceOf("block");
            for(int i = 0; i < ctx.expr().size(); i++){
                answer.add("value", getCode(ctx.expr(i)));
            }
            answer.add("value", templates.getInstanceOf("functionCall").add("name", name));
            setCode(ctx,answer);
        }
    }

    public void enterNot(CymbolParser.NotContext ctx) {
        BLabel test = getBWert(ctx.getParent());
        BLabel result;
        if (test != null) {
            result = new BLabel(test.index);
            if (ctx.getParent() instanceof CymbolParser.NotContext) {
                result.setbTrue(test.getbFalse());
                result.setbFalse(test.getbTrue());
            }else {
                result.setbTrue(test.getbTrue());
                result.setbFalse(test.getbFalse());
            }
        } else {
            int i = getIndex();
            result = new BLabel(i);
        }
        setBWert(ctx,result);
    }
    public void exitNot(CymbolParser.NotContext ctx) {
        setCode(ctx,getCode(ctx.bexpr()));
    }
    public void enterVergleich(CymbolParser.VergleichContext ctx) {
        BLabel test = getBWert(ctx.getParent());
        BLabel result;
        if (test != null) {
            result = new BLabel(test.index);
            if (ctx.getParent() instanceof CymbolParser.NotContext) {
                result.setbTrue(test.getbFalse());
                result.setbFalse(test.getbTrue());
            } else {
                result.setbTrue(test.getbTrue());
                result.setbFalse(test.getbFalse());
            }
        } else {
            int i = getIndex();
            result = new BLabel(i);
        }

        setBWert(ctx,result);

    }
    public void exitVergleich(CymbolParser.VergleichContext ctx) {

        String bTrue = getBWert(ctx).getbTrue();
        String bFalse = getBWert(ctx).getbFalse();

        ST left = getCode(ctx.expr(0));

        ST right = getCode(ctx.expr(1));

        ST result;
        if ( ctx.op.getType() == CymbolParser.EQUALS ){
            result = templates.getInstanceOf("relop").add("e1",left).add("e2",right).add("bTrue",bTrue).add("bFalse",bFalse).add("operator","ieq");
        } else if ( ctx.op.getType() == CymbolParser.UNEQUALS ) {
            result = templates.getInstanceOf("relop").add("e1",left).add("e2",right).add("bTrue",bFalse).add("bFalse",bTrue).add("operator","ieq");
        } else if (ctx.op.getType() == CymbolParser.SMALLER) {

            result = templates.getInstanceOf("relop").add("e1",left).add("e2",right).add("bTrue",bTrue).add("bFalse",bFalse).add("operator","ilt");
        } else {
            result = templates.getInstanceOf("relop").add("e1",right).add("e2",left).add("bTrue",bTrue).add("bFalse",bFalse).add("operator","ilt");        }

        setCode(ctx,result);
    }

    public void enterTrue(CymbolParser.TrueContext ctx) {
        int i = getIndex();
        BLabel result = new BLabel(i);
        setBWert(ctx,result);
    }
    public void exitTrue(CymbolParser.TrueContext ctx) {
        String value = getBWert(ctx).bTrue;
        setCode(ctx,templates.getInstanceOf("trueFalse").add("value",value));
    }
    public void exitFalse(CymbolParser.FalseContext ctx) {
        String value = getBWert(ctx).bFalse;
        setCode(ctx,templates.getInstanceOf("trueFalse").add("value",value));
    }
    public void enterFalse(CymbolParser.FalseContext ctx) {
        int i = getIndex();
        BLabel result = new BLabel(i);
        setBWert(ctx,result);
    }


    public void enterVergleichParens(CymbolParser.VergleichParensContext ctx) {

        BLabel test = getBWert(ctx.getParent());
        BLabel result;
        if (test != null) {
            result = new BLabel(test.index);
            if (ctx.getParent() instanceof CymbolParser.NotContext) {
                result.setbTrue(test.getbFalse());
                result.setbFalse(test.getbTrue());
            }else {
                result.setbTrue(test.getbTrue());
                result.setbFalse(test.getbFalse());
            }
        } else {
            int i = getIndex();
            result = new BLabel(i);
        }
        setBWert(ctx,result);
    }
    public void exitVergleichParens(CymbolParser.VergleichParensContext ctx) {
        setCode(ctx,getCode(ctx.bexpr()));
    }
    public void exitStatBlock(CymbolParser.StatBlockContext ctx) {
        setCode(ctx,getCode(ctx.block()));
    }
    public void exitWhileloop(CymbolParser.WhileloopContext ctx) {
        setCode(ctx,getCode(ctx.whileStat()));
    }
    public void exitForloop(CymbolParser.ForloopContext ctx) {
        setCode(ctx,getCode(ctx.forStat()));
    }
    public void exitIfElse(CymbolParser.IfElseContext ctx) {
        setCode(ctx,getCode(ctx.ifStat()));
    }
    public void exitPrint(CymbolParser.PrintContext ctx) {
        setCode(ctx,getCode(ctx.printStat()));
    }
    public void exitReturn(CymbolParser.ReturnContext ctx) {
        setCode(ctx,getCode(ctx.returnStat()));
    }
    public void exitExpression(CymbolParser.ExpressionContext ctx) {
        setCode(ctx,getCode(ctx.expr()));
    }
    public void exitAssign(CymbolParser.AssignContext ctx) {
        setCode(ctx,getCode(ctx.assignStat()));
    }

    public static void main(String[] args) throws Exception {
        String filename = "src/main/resources/CymbolProgs/evenodd.cymbol.c";
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
        String pcode = ref.getCode(tree).render().trim();
        System.out.println(pcode);
        String a = Interpreter.run2(pcode);
        System.out.println(a);
    }
}