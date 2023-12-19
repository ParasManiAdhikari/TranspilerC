package zwischencode;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/
public class Symbol { // A generic programming language symbol
    String name;      // All symbols at least have a name
    Scope scope;
    Type type;
    int index = 0;
    public enum Type {tINVALID, tVOID, tINT, tFLOAT}
    public Symbol(String name) { this.name = name; }
    public Symbol(String name, Type type, int index) {this(name); this.type = type; this.index = index;}
    public String getName() { return name; }

    public int nextVarIndex() { return index++; }
    public String toString() {
        if ( type!=null ) return '<'+getName()+":"+type+'>';
        return getName();
    }
}
