package w04_java_topic_2_loops_and_arrays;

import static input.InputUtils.*;

public class Example7 {

    public static void main(String[] args) {
        int squareSize = intInput("Enter the square size: ");
        String squareCharacter = stringInput("Enter the character to use: ");

        for (int x = 0; x < squareSize; x++) {
            for (int y = 0; y < squareSize; y++) {
                System.out.print(squareCharacter.charAt(0));
            }
            System.out.println();
        }
    }

}
