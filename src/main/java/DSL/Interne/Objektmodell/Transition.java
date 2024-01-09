package DSL.Interne.Objektmodell;

public class Transition {

    private State source;
    private String event;
    private State target;

    public Transition() { }

    public Transition(State source, String event, State target) {
        this.source = source;
        this.event = event;
        this.target = target;
    }

    public State getSource() {
        return source;
    }

    public void setSource(State source) {
        this.source = source;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public State getTarget() {
        return target;
    }

    public void setTarget(State target) {
        this.target = target;
    }

}