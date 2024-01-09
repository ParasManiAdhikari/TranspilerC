package DSL.Services;

import java.util.HashMap;
import java.util.Objects;
import java.util.stream.Collectors;

public class LexAnalysator {

    public String automat(HashMap<String[], HashMap<String, String>> table) {
        String[] state = {"",""};
        state[0] = table.keySet().stream().filter(x -> x[1].equals("_start")).toList().get(0)[0];
        for(int i = 1; i < table.size(); i++){
            state[0] = table.entrySet()
                    .stream()
                    .filter(x-> x.getKey()[0].equals(state[0]))
                    .toList()
                    .get(0).getValue()
                    .entrySet()
                    .stream()
                    .toList().get(1).getValue();
            if (Objects.equals(state[0], "\u03A9")) return "Error";
        }
        state[1] = table.keySet().stream().filter(x -> x[0].equals(state[0])).toList().get(0)[1];
        if (state[1] == "_end") return "Success";
        else return "Error";
    }

}
