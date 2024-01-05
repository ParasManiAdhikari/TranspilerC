package zwischencode;

public class Symbol {
    String name;
    String type;

    int index;
    public Symbol(String name, String type) {
        this.name = name;
        this.type = type;
        this.index = -1;
    }
    public Symbol(String name, String type,int index) {
        this.name = name;
        this.type = type;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getIndex() {
        return index;
    }
}
