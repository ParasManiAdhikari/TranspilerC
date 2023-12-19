package zwischencode;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;
import java.util.Stack;
import zwischencodeGENERATED.*;

public class zwischencodegeneratePhase extends CymbolBaseListener {
    ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope; // resolve symbols starting in this scope
    ST result = Expr.stg.getInstanceOf("result");
    boolean settingDef = false;
    String[] def = new String[2];
    boolean enteringFor = false;
    int ifForCounter = 0;
    Stack<Integer> ifForStack = new Stack<>();
    Stack<Integer> elseStack = new Stack<>();

    public zwischencodegeneratePhase(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
        this.scopes = scopes;
        this.globals = globals;
    }
    public void enterFile(CymbolParser.FileContext ctx) {
        currentScope = globals;
        if (globals.index > 0) result.add("append", new Expr.Globals(Integer.toString(globals.index)).code());
    }

    public void exitAddSub(CymbolParser.AddSubContext ctx) {
        if (ctx.op.getType() == CymbolParser.ADD) result.add("append", new Expr.Add().code());
        if (ctx.op.getType() == CymbolParser.SUB) result.add("append", new Expr.Sub().code());
    }

    public void exitMultDiv(CymbolParser.MulDivContext ctx) {
        result.add("append", new Expr.Mult().code());
    }

    public void exitInt(CymbolParser.IntContext ctx) {
        if (!enteringFor) result.add("append", new Expr.Int("" + ctx.INT().getText()).code());
    }

    public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        currentScope = scopes.get(ctx);
        def[0] = ctx.ID().getText();
        def[1] = "0";
        settingDef = true;
    }

    public void enterFormalParameters(CymbolParser.FormalParametersContext ctx) {
        def[1] = "" + ctx.formalParameter().size();
    }

    public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        currentScope = currentScope.getEnclosingScope();
        if (ctx.ID().getText().equals("main")) result.add("append", new Expr.Halt().code());
    }

    public void enterForStat(CymbolParser.ForStatContext ctx) {
        ifForCounter++;
        ifForStack.push(ifForCounter);
        enteringFor = true;
        result.add("append", new Expr.StartForStat("" + ifForCounter).code());
    }

    public void exitForStat(CymbolParser.ForStatContext ctx) {
        result.add("append", new Expr.ExitForStat("" + ifForStack.pop()).code());
    }

    public void enterWhileStat(CymbolParser.WhileStatContext ctx) {
        ifForCounter++;
        ifForStack.push(ifForCounter);
        result.add("append", new Expr.StartForStat("" + ifForCounter).code());
    }

    public void exitWhileStat(CymbolParser.WhileStatContext ctx) {
        result.add("append", new Expr.ExitForStat("" + ifForStack.pop()).code());
    }

    public void exitAssignStat(CymbolParser.AssignStatContext ctx) {
        if (currentScope.resolve(ctx.ID().getText()).scope.getScopeName().equals("globals") && !enteringFor)
            result.add("append", new Expr.DeclareGlobal("" + currentScope.resolve(ctx.ID().getText()).index).code());
        else if (currentScope.resolve(ctx.ID().getText()).scope.getScopeName().equals("locals") && !enteringFor)
            result.add("append", new Expr.DeclareLocal("" + currentScope.resolve(ctx.ID().getText()).index).code());
        enteringFor = false;
    }

    public void exitIsNot(CymbolParser.IsNotContext ctx) {
    }

    public void exitComparison(CymbolParser.ComparisonContext ctx) {
        if (ctx.op.getType() == CymbolParser.LT) result.add("append", new Expr.Ilt().code());
        // if (ctx.op.getType() == CymbolParser.GT) result.add("append", new Expr.Equal("").code());
        if (ctx.op.getType() == CymbolParser.EQ) result.add("append", new Expr.Equal().code());
        // if (ctx.op.getType() == CymbolParser.NEQ) result.add("append", new Expr.Equal("").code());
        // result.add("append", new Expr.ForStat("" + currentScope.nextScopeIndex()).code());
        int fromFor = ifForStack.pop();
        result.add("append", new Expr.BrfTrue("" + fromFor).code());
        ifForStack.push(fromFor);
    }

    public void enterIfStat(CymbolParser.IfStatContext ctx) {
        ifForCounter++;
        ifForStack.push(ifForCounter);
        if (ctx.elseStat() != null) {
            elseStack.push(ifForCounter);
        }
    }

    public void enterElseStat(CymbolParser.ElseStatContext ctx) {
        int ifForIndex = ifForStack.pop();
        int elseIndex = elseStack.pop();
        if (ifForIndex == elseIndex) {
            result.add("append", new Expr.EnterElse("" + elseIndex).code());
        }
        ifForStack.push(ifForIndex);
        elseStack.push(elseIndex);
    }

    public void exitIfStat(CymbolParser.IfStatContext ctx) {
        if (!elseStack.empty()) {
            int ifForIndex = ifForStack.pop();
            int elseIndex = elseStack.pop();
            if (ifForIndex != elseIndex) {
                elseStack.push(elseIndex);
                result.add("append", new Expr.ExitIf("" + ifForStack.pop()).code());
            }
        } else {
            result.add("append", new Expr.ExitIf("" + ifForStack.pop()).code());
        }

    }

    public void exitIsTrue(CymbolParser.IsTrueContext ctx) {
    }

    public void exitIsFalse(CymbolParser.IsFalseContext ctx) {
    }

    public void exitFullBExpr(CymbolParser.BracketBexprContext ctx) {
    }

    public void exitPrintStat(CymbolParser.PrintStatContext ctx) {
        result.add("append", new Expr.PrintStat().code());
    }

    public void exitFile(CymbolParser.FileContext ctx) {
    }

    public void exitNegateVar(CymbolParser.NegateVarContext ctx) {
        result.add("append", new Expr.NegateVar(ctx.expr().getText()).code());
    }

    public void exitReturnStat(CymbolParser.ReturnStatContext ctx) {
        result.add("append", new Expr.Ret().code());
    }

    public void enterBlock(CymbolParser.BlockContext ctx) {
        currentScope = scopes.get(ctx);
        if (settingDef) {
            result.add("append", new Expr.FunctionDecl(def[0], def[1], "" + currentScope.toString().split(", ").length).code());
            settingDef = false;
        }
    }
    public void exitBlock(CymbolParser.BlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    public void exitVar(CymbolParser.VarContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        if (currentScope.resolve(name).scope.getScopeName().equals("globals"))
            result.add("append", new Expr.Gload("" + currentScope.resolve(name).index).code());
        else
            result.add("append", new Expr.Load("" + currentScope.resolve(name).index).code());
    }

    public void exitVarDecl(CymbolParser.VarDeclContext ctx) {
        if (ctx.type().getText().equals("int"))
            result.add("append", new Expr.Int("0").code());
        if (ctx.type().getText().equals("float"))
            result.add("append", new Expr.Float("" + "0").code());
        if (currentScope.resolve(ctx.ID().getText()).scope.getScopeName().equals("globals"))
            result.add("append", new Expr.DeclareGlobal("" + currentScope.resolve(ctx.ID().getText()).index).code());
        else
            result.add("append", new Expr.DeclareLocal("" + currentScope.resolve(ctx.ID().getText()).index).code());
    }

    public void exitCall(CymbolParser.CallContext ctx) {
        // can only handle f(...) not expr(...)
        String funcName = ctx.ID().getText();
        Symbol meth = currentScope.resolve(funcName);
        if ( meth==null ) {
            CheckSymbols.error(ctx.ID().getSymbol(), "no such function: "+funcName);
        }
        if ( meth instanceof VariableSymbol ) {
            CheckSymbols.error(ctx.ID().getSymbol(), funcName+" is not a function");
        }
        result.add("append", new Expr.Call(ctx.ID().getText()).code());
    }

}
