package DSL.Interne;

import DSL.Interne.FluentApi.AFSMImpl;
import DSL.Interne.objektmodell.State;
import DSL.Interne.objektmodell.Transition;

public class AFSMAutomat {

    public AFSMImpl afsm;

    public AFSMAutomat(){
        afsm = new AFSMImpl();
    }

    public void createLoginAutomat(){
        State initialState = new State("InitialState", true, false);
        State usernameEnteredState = new State("UsernameEnteredState", false, false);
        State acceptState = new State("AcceptState", false, true);

        afsm.addState(initialState).addState(usernameEnteredState).addState(acceptState)
                .addTransition(new Transition(initialState,  usernameEnteredState))
                .addTransition(new Transition(usernameEnteredState, acceptState));
    }

    public void createLoopingAlarmSystemAutomat(){
        State alarmState = new State("AlarmState", true, true);
        afsm.addState(alarmState)
                .addTransition(new Transition(alarmState,  alarmState));
    }

    public void createVendingMachineAutomat(){
        State initialState = new State("InitialState", true, false);
        State selectionState = new State("SelectionState", false, false);
        State acceptState = new State("AcceptState", false, true);

        afsm.addState(initialState).addState(selectionState).addState(acceptState)
                .addTransition(new Transition(initialState, selectionState))
                .addTransition(new Transition(selectionState,  acceptState));
    }
}
