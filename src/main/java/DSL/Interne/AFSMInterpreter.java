package DSL.Interne;


import DSL.Interne.FluentApi.AFSMImpl;
import DSL.Interne.FluentApi.ActionStatePair;
import DSL.Interne.Objektmodell.State;


import java.util.ArrayList;
import java.util.List;

public class AFSMInterpreter {

    public State state;

    public List<String> run(AFSMImpl afsm, List<String> input) {

        ArrayList<String> output = new ArrayList<>();
        state = afsm.getInitialState();

        for (String s : input) {
            ActionStatePair pair = afsm.makeTransition(state, s);
            if (pair != null) {
                output.add(pair.event);
                state = pair.target;
            }
        }

        return output;
    }

}