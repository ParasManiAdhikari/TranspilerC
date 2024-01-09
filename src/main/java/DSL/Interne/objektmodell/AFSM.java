package DSL.Interne.objektmodell;

import java.util.LinkedList;
import java.util.List;

public class AFSM {

    private List<State> states = new LinkedList<>();

    private List<Transition> transitions = new LinkedList<>();

    public List<State> getStates() { return states; }

    public List<Transition> getTransitions() { return transitions; }

}