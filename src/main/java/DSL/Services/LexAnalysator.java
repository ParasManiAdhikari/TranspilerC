package DSL.Services;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LexAnalysator {

    private static HashMap<String, HashMap<Character, String>> x = new HashMap<>();
    private static HashMap<Character, String> y = new HashMap<>();

    public String automat(HashMap<String[], HashMap<String, String>> table) {
        String[] state = {"",""};
        state[0] = table.keySet().stream().filter(x -> x[1].equals("_start")).collect(Collectors.toList()).get(0)[0];
        for(int i = 0; i < table.size(); i++){
            String copy = state[0];
            List<String[]> a = table.keySet().stream().filter(x -> x[0].equals(state[0])).collect(Collectors.toList());
            String text = a.get(0)[1];
            boolean test = text == "_end";
            if(test){
                break;
            }
            state[0] = table.entrySet()
                    .stream()
                    .filter(x-> x.getKey()[0].equals(state[0]))
                    .collect(Collectors.toList())
                    .get(0).getValue()
                    .entrySet()
                    .stream()
                    .collect(Collectors.toList()).get(1).getValue();
            if (state[0] == "\u03A9") return "Error";
        }
        state[1] = table.keySet().stream().filter(x -> x[0].equals(state[0])).collect(Collectors.toList()).get(0)[1];
        if (state[1] == "_end") return "Success";
        else return "Error";
    }

}
