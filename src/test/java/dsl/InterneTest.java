package dsl;

import DSL.Interne.AFSMAutomat;
import DSL.Interne.AFSMInterpreter;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;


public class InterneTest {

    public static Object[] params1() {
        return new Object[]{
                new Object[]{"ba"},
        };
    }

    public static Object[] params2() {
        return new Object[]{
                new Object[]{"a"},
                new Object[]{"aa"},
        };
    }

    public static Object[] params3() {
        return new Object[]{
                new Object[]{"ab"},
                new Object[]{"ba"},
        };
    }

    @ParameterizedTest
    @MethodSource(value = {"params1"})
    public void test1(String inputs){
        List<String> input = List.of(inputs.split(""));

        AFSMAutomat afsmAutomat = new AFSMAutomat();
        afsmAutomat.createAutomat1();

        AFSMInterpreter interpreter = new AFSMInterpreter();

        Assert.assertEquals(input, interpreter.run(afsmAutomat.afsm, input));
        Assert.assertTrue(interpreter.state.isAccepted());
    }

    @ParameterizedTest
    @MethodSource(value = {"params2"})
    public void test2(String inputs){
        List<String> input = List.of(inputs.split(""));

        AFSMAutomat afsmAutomat = new AFSMAutomat();
        afsmAutomat.createAutomat2();

        AFSMInterpreter interpreter = new AFSMInterpreter();

        Assert.assertEquals(input, interpreter.run(afsmAutomat.afsm, input));
        Assert.assertTrue(interpreter.state.isAccepted());
    }

    @ParameterizedTest
    @MethodSource(value = {"params3"})
    public void test3(String inputs){
        List<String> input = List.of(inputs.split(""));

        AFSMAutomat afsmAutomat = new AFSMAutomat();
        afsmAutomat.createAutomat3();

        AFSMInterpreter interpreter = new AFSMInterpreter();

        Assert.assertEquals(input, interpreter.run(afsmAutomat.afsm, input));
        Assert.assertTrue(interpreter.state.isAccepted());
    }

}


