package vsys;

import java.io.Serializable;
import java.util.Objects;

public class Tuple<A,B> implements Serializable {

    public final A fst;
    public final B snd;

    public Tuple(A fst, B snd) {
        this.fst = Objects.requireNonNull(fst);
        this.snd = Objects.requireNonNull(snd);
    }

    @Override
    public String toString() {
        return String.format("(%s,%s)", fst,  snd);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tuple))
            return false;
        else {
            @SuppressWarnings("rawtypes")
            Tuple that = (Tuple) o;
            return fst.equals(that.fst) && snd.equals(that.snd);
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + fst.hashCode();
        result = prime * result + snd.hashCode();
        return result;
    }

    public Tuple<B,A> swap() {
        return new Tuple<>(snd, fst);
    }

    public static <A,B> Tuple<A,B> tuple(A fst, B snd){
        return new Tuple<>(fst,snd);
    }
}
