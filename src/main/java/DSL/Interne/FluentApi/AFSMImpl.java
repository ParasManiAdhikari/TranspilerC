package DSL.Interne.FluentApi;



import DSL.Interne.Objektmodell.State;
import DSL.Interne.Objektmodell.Transition;

import java.util.HashMap;

public class AFSMImpl implements AFSM {

    private State initialState;
    HashMap<State, HashMap<String, ActionStatePair>> afsm = new HashMap<>();

    public AFSMImpl() { }

    public AFSM addState(State id) {
        if (initialState == null) initialState = id;
        if (afsm.containsKey(id)) return this;
        afsm.put(id, new HashMap<>());
        return this;
    }

    public AFSM addTransition(Transition transition) {
        if (afsm.get(transition.getSource()).containsKey(transition.getEvent())) return this;
        afsm.get(transition.getSource()).put(transition.getEvent(), new ActionStatePair(transition.getEvent(), transition.getTarget()));
        return this;
    }

    public State getInitialState(){
        return initialState;
    }

    public ActionStatePair makeTransition(State state, String event) {
        if (!afsm.containsKey(state)) {
            System.out.println("FIRST");
            return null;
        }
        if (!afsm.get(state).containsKey(event)) {
            System.out.println("SECOND");
            return null;
        }
        return afsm.get(state).get(event);
    }

}