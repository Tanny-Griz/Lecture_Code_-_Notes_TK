package w04_java_topic_2_loops_and_arrays;

import java.util.Random;

import static input.InputUtils.*;

public class Example10 {

    public static void main(String[] args) {
        Random randomN = new Random();
        int secretNumber = randomN.nextInt(10) + 1;
        int guess = intInput("Guess a number between 1 and 10: ");

        while (guess != secretNumber) {
            if (guess < secretNumber) {
                System.out.println("Guess higher");
            }
            else {
                System.out.println("Guess lower");
            }

            guess = intInput("Try again: ");
        }

        System.out.println("Correct! You guessed the number.");
    }

}
