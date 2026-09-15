package w04_java_topic_2_loops_and_arrays;

import static input.InputUtils.*;

public class Example8 {

    public static void main(String[] args) {
        String secretPassword = "kittens";
        String userPassword = "";
        int attempts = 0;
        int maxAttempts = 5;

        while (!userPassword.equals(secretPassword) && attempts < maxAttempts) {
            userPassword = stringInput("Enter the password");
            attempts++;

            if (!userPassword.equals(secretPassword) && attempts < maxAttempts) {
                System.out.println("Password incorrect, access denied!");
                System.out.println("Try again");
            }
        }

        if (userPassword.equals(secretPassword)) {
            System.out.println("Correct password - access granted");
        }
        else {
            System.out.println("Password incorrect, access denied!");
        }
    }

}
