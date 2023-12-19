package zwischencode;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import zwischencode.Symbol;

public class Expr {
    public static STGroup stg = new STGroupFile("src/main/resources/stringtemplate/Zwischencode.stg");
    public static class Add extends Expr {
        public Add() {}
        public ST code() {
            return stg.getInstanceOf("add");
        }
    }

    public static class Sub extends Expr {
        public Sub() {}
        public ST code() {
            return stg.getInstanceOf("sub");
        }
    }

    public static class Mult extends Expr {
        public Mult() {}
        public ST code() {
            return stg.getInstanceOf("mult");
        }
    }

    public static class Int extends Expr {
        String e1;
        public Int(String x) { e1 = x;}
        public ST code() {
            ST st = stg.getInstanceOf("int");
            st.add("e1", e1);
            return st;
        }
    }

    public static class Float extends Expr {
        String e1;
        public Float(String x) { e1 = x;}
        public ST code() {
            ST st = stg.getInstanceOf("float");
            st.add("e1", e1);
            return st;
        }
    }

    public static class DeclareGlobal extends Expr {
        String e1;
        public DeclareGlobal(String x) { e1 = x;}
        public ST code() {
            ST st = stg.getInstanceOf("declareGlobal");
            st.add("e1", e1);
            return st;
        }
    }

    public static class DeclareLocal extends Expr {
        String e1;
        public DeclareLocal(String x) { e1 = x;}
        public ST code() {
            ST st = stg.getInstanceOf("declareLocal");
            st.add("e1", e1);
            return st;
        }
    }

    public static class VarDecl extends Expr {
        String constKind, store, index;
        public VarDecl(String x, String z, String ind) { constKind = x; store = z; index =ind;}
        public ST code() {
            ST st = stg.getInstanceOf("varDecl");
            st.add("constKind", constKind);
            st.add("store", store);
            st.add("index", index);
            return st;
        }
    }

    public static class FunctionDecl extends Expr {
        String id, argsAmount, localsAmount;
        public FunctionDecl(String i, String x, String z) { id = i; argsAmount = x; localsAmount = z;}
        public ST code() {
            ST st = stg.getInstanceOf("functionDecl");
            st.add("id", id);
            st.add("argsAmount", argsAmount);
            st.add("localsAmount", localsAmount);
            return st;
        }
    }

    public static class Globals extends Expr {
        String amount;
        public Globals(String x) { amount = x;}
        public ST code() {
            ST st = stg.getInstanceOf("globals");
            st.add("amount", amount);
            return st;
        }
    }

    public static class StartForStat extends Expr {
        String value;
        public StartForStat(String n) { value = n;}
        public ST code() {
            ST st = stg.getInstanceOf("startFor");
            st.add("value", value);
            return st;
        }
    }

    public static class ExitForStat extends Expr {
        String value;
        public ExitForStat(String n) { value = n;}
        public ST code() {
            ST st = stg.getInstanceOf("exitFor");
            st.add("value", value);
            return st;
        }
    }

    public static class NegateVar extends Expr {
        String value;
        public NegateVar(String n) { value = n;}
        public ST code() {
            ST st = stg.getInstanceOf("negateVar");
            st.add("value", value);
            return st;
        }
    }

    public static class Load extends Expr {
        String id;
        public Load(String x) { id = x;}
        public ST code() {
            ST st = stg.getInstanceOf("load");
            st.add("id", id);
            return st;
        }
    }

    public static class Gload extends Expr {
        String id;
        public Gload(String x) { id = x;}
        public ST code() {
            ST st = stg.getInstanceOf("gload");
            st.add("id", id);
            return st;
        }
    }

    public static class Ilt extends Expr {
        public Ilt() {}
        public ST code() {
            return stg.getInstanceOf("ilt");
        }
    }

    public static class BrfTrue extends Expr {
        String target;
        public BrfTrue(String x) { target = x;}
        public ST code() {
            ST st = stg.getInstanceOf("brfTrue");
            st.add("target", target);
            return st;
        }
    }

    public static class Equal extends Expr {
        public Equal() {}
        public ST code() {
            return stg.getInstanceOf("equal");
        }
    }

    public static class ExitIf extends Expr {
        String value;
        public ExitIf(String x) { value = x;}
        public ST code() {
            ST st = stg.getInstanceOf("exitIf");
            st.add("value", value);
            return st;
        }
    }

    public static class EnterElse extends Expr {
        String value;
        public EnterElse(String x) { value = x;}
        public ST code() {
            ST st = stg.getInstanceOf("enterElse");
            st.add("value", value);
            return st;
        }
    }

    public static class Br extends Expr {
        String value;
        public Br(String x) { value = x;}
        public ST code() {
            ST st = stg.getInstanceOf("br");
            st.add("value", value);
            return st;
        }
    }

    public static class Ret extends Expr {
        public Ret() {}
        public ST code() {
            return stg.getInstanceOf("ret");
        }
    }

    public static class PrintStat extends Expr {
        public PrintStat() {}
        public ST code() {
            return stg.getInstanceOf("printStat");
        }
    }

    public static class Halt extends Expr {
        public Halt() {}
        public ST code() {
            return stg.getInstanceOf("halt");
        }
    }

    public static class Call extends Expr {
        String id;
        public Call(String x) { id = x;}
        public ST code() {
            ST st = stg.getInstanceOf("call");
            st.add("id", id);
            return st;
        }
    }

    public static class Test extends Expr {
        public Test() {}
        public ST code() {
            return stg.getInstanceOf("test");
        }
    }
}
