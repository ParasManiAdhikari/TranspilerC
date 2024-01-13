package DSL.Services;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.List;


public class CodeGenerator {
    public static void main(String[] args) {
        // Replace these with your actual model data
        List<String> states = List.of("State1", "State2", "State3");
        String initialState = "State1";
        List<String> events = List.of("Event1", "Event2", "Event3");
        List<String> actions = List.of("Action1", "Action2", "Action3");
        List<TransitionGroup> transitionGroups = List.of(
                new TransitionGroup("State1", List.of(new Transition("Event1", "Action1", "State2"))),
                new TransitionGroup("State2", List.of(new Transition("Event2", "Action2", "State3")))
                // Add more transition groups as needed
        );

        generateCCode(states, initialState, events, actions, transitionGroups);
    }

    static class Transition {
        String event;
        String action;
        String target;

        public Transition(String event, String action, String target) {
            this.event = event;
            this.action = action;
            this.target = target;
        }
    }

    static class TransitionGroup {
        String stateId;
        List<Transition> transitions;

        public TransitionGroup(String stateId, List<Transition> transitions) {
            this.stateId = stateId;
            this.transitions = transitions;
        }
    }

    static void generateCCode(List<String> states, String initialState, List<String> events, List<String> actions,
                              List<TransitionGroup> transitionGroups) {
        STGroup stGroup = new STGroupFile("src/main/java/DSL/Services/ctemplate.stg");
        ST template = stGroup.getInstanceOf("main");

        template.add("states", states);
        template.add("initial", initialState);
        template.add("events", events);
        template.add("actions", actions);
        template.add("tgroups", transitionGroups);

        System.out.println(template.render());
    }
}
