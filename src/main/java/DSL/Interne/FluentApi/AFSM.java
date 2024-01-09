package DSL.Interne.FluentApi;


import DSL.Interne.Objektmodell.State;
import DSL.Interne.Objektmodell.Transition;

public interface AFSM {

    AFSM addState(State state);
    AFSM addTransition(Transition transition);
    State getInitialState();
    ActionStatePair makeTransition(State state, String event);

}