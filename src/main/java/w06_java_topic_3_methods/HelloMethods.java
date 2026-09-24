package w06_java_topic_3_methods;

import static input.InputUtils.*;

public class HelloMethods {

    public static void main(String[] args) {

        String name = stringInput("Please enter your name");

        String greeting = makeGreeting(name);

        System.out.println(greeting);
    }

    public static String makeGreeting(String n) {

        // Create greeting text
        String greeting = "Hello " + n + "!";

        return greeting;
    }
}
