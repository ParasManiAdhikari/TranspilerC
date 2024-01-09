package dsl;

import DSL.CSVLexer;
import DSL.CSVParser;
import DSL.Interne.AFSMAutomat;
import DSL.Interne.AFSMInterpreter;
import DSL.Services.CSVLoader;
import DSL.Services.LexAnalysator;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Assert;
import org.junit.experimental.theories.DataPoint;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    @DataPoint
    public static List<String> Sucess = Arrays.asList("1", "1", "0", "0");
}


