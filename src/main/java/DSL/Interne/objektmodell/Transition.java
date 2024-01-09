package DSL.Interne.objektmodell;

public class Transition {

    private State source;
    private State target;

    public Transition(State source, State target) {
        this.source = source;
        this.target = target;
    }

    public State getSource() {
        return source;
    }

    public void setSource(State source) {
        this.source = source;
    }


    public State getTarget() {
        return target;
    }

    public void setTarget(State target) {
        this.target = target;
    }

}
