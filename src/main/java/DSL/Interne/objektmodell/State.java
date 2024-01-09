package DSL.Interne.objektmodell;

public class State {

    private String id;
    private boolean initial;
    private boolean accepted;

    public State(String id, boolean initial, boolean accepted) {
        this.id = id;
        this.initial = initial;
        this.accepted = accepted;
    }

    public String getStateID() {
        return id;
    }

    public void setStateID(String state) {
        this.id = state;
    }

    public boolean isInitial() {
        return initial;
    }

    public void setInitial(boolean initial) {
        this.initial = initial;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public boolean isAccepted(){
        return accepted;
    }

}
