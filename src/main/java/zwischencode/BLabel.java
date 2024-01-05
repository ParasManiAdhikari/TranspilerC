package zwischencode;

//generate labels for true and false branches in conditional statements
public class BLabel {
    public String bTrue;
    public String bFalse;

    public int index;
    public BLabel(int index) {
        this.index = index;
        this.bTrue = "bTrue" + index;
        this.bFalse = "bFalse" + index;
    }

    public String getbTrue() {
        return bTrue;
    }

    public int getIndex() {
        return this.index;
    }

    public String getbFalse() {
        return bFalse;
    }

    public void setbTrue(String bTrue) {
        this.bTrue = bTrue;
    }

    public void setbFalse(String bFalse) {
        this.bFalse = bFalse;
    }

    public String toString() {
        return "index:\t" + index +"\nbTrue:\t" + bTrue + "\nbFalse:\t" + bFalse;
    }
}
