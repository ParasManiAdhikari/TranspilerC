package zwischencode;

public class LocalScope extends BaseScope {
    public int index;
    public LocalScope(Scope parent) {
        super(parent);
        index = 0;
    }
    public String getScopeName() { return "locals"; }
    public int nextVarIndex() { return index++; }
}
