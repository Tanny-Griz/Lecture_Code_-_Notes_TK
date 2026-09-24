package w06_java_topic_3_methods;

import static input.InputUtils.*;

public class Squares {

    public static void main(String[] args) {

        // Get number from user
        double number = doubleInput("Please enter a number and I'll square it");

        // Square the number
        square(number);
    }

    public static void square(double n) {

        // Number times itself
        double sq = n * n;

        // Print answer
        System.out.println("The square of " + n + " is " + sq);
    }
}
