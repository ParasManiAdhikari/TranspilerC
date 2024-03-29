package DSL.Services;

import DSL.Interne.FluentApi.AFSMImpl;
import DSL.Interne.objektmodell.State;
import DSL.Interne.objektmodell.Transition;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.StringRenderer;

import java.util.LinkedList;
import java.util.List;

public class CGenerator {

    public static void main(String[] args) {
        AFSMImpl afsm1 = new AFSMImpl();
        AFSMImpl afsm2 = new AFSMImpl();
        State alarmState = new State("AlarmState", true, true);
        afsm1.addState(alarmState)
                .addTransition(new Transition(alarmState,  alarmState));

        State initialState = new State("InitialState", true, false);
        State moneypaidState = new State("MoneyPaidState", false, false);
        State alternateState = new State("AlternateState", false, false);
        State acceptState = new State("AcceptState", false, true);

        afsm2.addState(initialState).addState(moneypaidState).addState(acceptState)
                .addTransition(new Transition(initialState, moneypaidState, 1))
                .addTransition(new Transition(initialState, alternateState, 2))
                .addTransition(new Transition(moneypaidState, acceptState, 1));

        String result = generateC(afsm2);
        System.out.println(result);
    }

    private static class TGroup {
        public String stateid;
        public String target;
        public int event;
    }

    public static String generateC(AFSMImpl afsm){
        // Data for string template

        List<String> states = new LinkedList<>();
        List<TGroup> tgroups = new LinkedList<>();
        String initialState = null;
        String acceptedState = null;

        // Filling the data
        for (State s : afsm.getStates()){
            states.add(s.getStateID());
            if(s.isInitial()){
                initialState = s.getStateID();
            }
            if(s.isAccepted()){
                acceptedState = s.getStateID();
            }
        }
        List<Transition> tr = afsm.getTransitions();
        for(Transition t: tr){
            TGroup tg = new TGroup();
            tg.stateid = t.getSource().getStateID();
            tg.target = t.getTarget().getStateID();
            tg.event = t.getEvent();
            tgroups.add(tg);
        }

        // String template
        STGroup group = new STGroupFile("src/main/java/DSL/Services/ctemplate.stg");
        group.registerRenderer(String.class, new StringRenderer());
        ST main = group.getInstanceOf("main");
        main.add("states", states);
        main.add("initial", initialState);
        main.add("accept", acceptedState);
        main.add("tgroups", tgroups);
        return main.render();
    }
}
