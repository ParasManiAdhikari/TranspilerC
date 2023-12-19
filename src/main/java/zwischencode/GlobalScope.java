package zwischencode;

public class GlobalScope extends BaseScope {
    int index = 0;
    public GlobalScope(Scope enclosingScope) { super(enclosingScope); }
    public String getScopeName() { return "globals"; }
    @Override
    public int nextVarIndex() {
        return index++;
    }
}