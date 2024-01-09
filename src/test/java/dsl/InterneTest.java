package dsl;

import DSL.Interne.AFSMAutomat;
import DSL.Interne.AFSMInterpreter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class InterneTest {

    @Test
    public void testLoginAutomat(){

        AFSMAutomat afsmAutomat = new AFSMAutomat();
        afsmAutomat.createLoginAutomat();
        AFSMInterpreter interpreter = new AFSMInterpreter();
        interpreter.run(afsmAutomat.afsm, "InitialState");
        assertTrue(interpreter.state.isAccepted());
    }

    @Test
    public void testLoopingAlarmSystem(){

        AFSMAutomat afsmAutomat = new AFSMAutomat();
        afsmAutomat.createLoopingAlarmSystemAutomat();

        AFSMInterpreter interpreter = new AFSMInterpreter();
        interpreter.run(afsmAutomat.afsm, "AlarmState");
        assertTrue(interpreter.state.isAccepted());
    }

    @Test
    public void test3(){

        AFSMAutomat afsmAutomat = new AFSMAutomat();
        afsmAutomat.createVendingMachineAutomat();
        AFSMInterpreter interpreter = new AFSMInterpreter();
        interpreter.run(afsmAutomat.afsm, "InitialState");
        assertTrue(interpreter.state.isAccepted());
    }
}


