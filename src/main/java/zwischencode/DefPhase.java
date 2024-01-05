package zwischencode;

//execute actions during the "definition phase" of parsing, specifically focusing on defining variables and functions in a global scope

public class DefPhase extends CymbolBaseListener {

    public GlobalScope globalscope = new GlobalScope();


    public void exitVarDecl(CymbolParser.VarDeclContext ctx) {
        int index = globalscope.getNextAvailableIndex();
        String name = ctx.ID().getText();
        String type = ctx.type().getText();
        VariableSymbol var = new VariableSymbol(name,type,index);
        globalscope.define(var);
    }

    public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        String name = ctx.ID().getText();
        String type = ctx.type().getText();
        FunctionSymbol sym = new FunctionSymbol(name,type);
        globalscope.define(sym);
    }
}
