package DSL.Interne;

import DSL.Interne.FluentApi.AFSMImpl;
import DSL.Interne.Objektmodell.State;
import DSL.Interne.Objektmodell.Transition;

public class AFSMAutomat {

    public AFSMImpl afsm;

    public AFSMAutomat(){
        afsm = new AFSMImpl();
    }

    public void createAutomat1(){
        State q0;
        State q1;

        q0 = new State("q0", true, false);
        q1 = new State("q1", false, true);

        afsm.addState(q0).addState(q1)
                .addTransition(new Transition(q0, "b", q0))
                .addTransition(new Transition(q0,"a" , q1));

    }

    public void createAutomat2(){
        State q0;

        q0 = new State("q0", true, true);
        afsm.addState(q0).addTransition(new Transition(q0,"a", q0));
    }

    public void createAutomat3(){
        State q0;
        State q1;
        State q2;

        q0 = new State("q0", true, false);
        q1 = new State("q1", false, false);
        q2 = new State("q2", false, true);

        afsm.addState(q0).addState(q1).addState(q2)
                .addTransition(new Transition(q0, "a", q1))
                .addTransition(new Transition(q0, "b", q1))
                .addTransition(new Transition(q1, "a", q2))
                .addTransition(new Transition(q1, "b", q2));
    }
}
