import org.stringtemplate.v4.*;

public class Test {
    public static void main(String[] args) {
        ST hello = new ST("Hello, <name>!");
        hello.add("name", "World");
        String output = hello.render();
        System.out.println(output);
    }
}
