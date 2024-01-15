package dsl;

import DSL.Interne.AFSMAutomat;
import DSL.Interne.AFSMInterpreter;
import org.junit.jupiter.api.Test;

import static DSL.Services.CGenerator.generateC;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class InterneTest {

    @Test
    public void testCheckoutAutomat(){

        AFSMAutomat afsmAutomat = new AFSMAutomat();
        afsmAutomat.createCheckoutAutomat();
        AFSMInterpreter interpreter = new AFSMInterpreter();
        interpreter.run(afsmAutomat.afsm, "InitialState");
        System.out.println(generateC(afsmAutomat.afsm));
        assertTrue(interpreter.state.isAccepted());
    }

    @Test
    public void testLoopingAlarmSystem(){

        AFSMAutomat afsmAutomat = new AFSMAutomat();
        afsmAutomat.createLoopingAlarmSystemAutomat();
        AFSMInterpreter interpreter = new AFSMInterpreter();
        interpreter.run(afsmAutomat.afsm, "AlarmState");
        System.out.println(generateC(afsmAutomat.afsm));
        assertTrue(interpreter.state.isAccepted());
    }

    @Test
    public void testVendingMachineAutomat(){

        AFSMAutomat afsmAutomat = new AFSMAutomat();
        afsmAutomat.createVendingMachineAutomat();
        AFSMInterpreter interpreter = new AFSMInterpreter();
        interpreter.run(afsmAutomat.afsm, "InitialState");
        System.out.println(generateC(afsmAutomat.afsm));
        assertTrue(interpreter.state.isAccepted());
    }
}


