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

public class afsmCGenerator {

    public static void main(String[] args) {
        AFSMImpl afsm = new AFSMImpl();
        State initialState = new State("InitialState", true, false);
        State moneypaidState = new State("MoneyPaidState", false, false);
        State acceptState = new State("AcceptState", false, true);

        afsm.addState(initialState).addState(moneypaidState).addState(acceptState)
                .addTransition(new Transition(initialState, moneypaidState))
                .addTransition(new Transition(moneypaidState, acceptState));

        String result = generateC(afsm);
        System.out.println(result);

    }
    private static class TGroup {
        public String start;
        public String destination;
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
        for(State s: afsm.getStates()){
            if(!s.isAccepted()){
                TGroup tg = new TGroup();
                tg.start = s.getStateID();
                State destination = afsm.getDestination(s);
                tg.destination = destination.getStateID();
                tgroups.add(tg);
            }
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
