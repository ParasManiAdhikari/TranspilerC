package DSL.Interne.FluentApi;


import DSL.Interne.objektmodell.State;
import DSL.Interne.objektmodell.Transition;

public interface AFSM {

    AFSM addState(State state);
    AFSM addTransition(Transition transition);
    State getInitialState();
    StateStatePair makeTransition(State state);

}
