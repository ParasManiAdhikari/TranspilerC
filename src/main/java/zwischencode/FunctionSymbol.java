package zwischencode;

import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionSymbol extends Symbol implements Scope {

    Scope enclosingScope;
    Map<String, Symbol> arguments = new LinkedHashMap<String, Symbol>();
    public FunctionSymbol(String name, Symbol.Type type, Scope currentScope) {
        super(name, type, 0);
        this.enclosingScope = currentScope;
    }

    @Override
    public String getScopeName() {
        return name;
    }

    @Override
    public Scope getEnclosingScope() {
        // HERNEY
        return enclosingScope;
    }

    @Override
    public void define(Symbol sym) {
        // HERNEY
        arguments.put(sym.name, sym);
        sym.scope = this; // track the scope in each symbol
    }

    @Override
    public Symbol resolve(String name) {
        // HERNEY
        Symbol s = arguments.get(name);
        if ( s!=null ) return s;
        // if not here, check any enclosing scope
        if ( getEnclosingScope() != null ) {
            return getEnclosingScope().resolve(name);
        }
        return null; // not found
    }

    @Override
    public int nextVarIndex() {
        return 0;
    }
}
