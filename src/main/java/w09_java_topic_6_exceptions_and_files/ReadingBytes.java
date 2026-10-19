package w09_java_topic_6_exceptions_and_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class ReadingBytes {
    public static void main(String[] args) throws IOException {

        // Create a Path object for the file
        Path helloFilePath = Path.of("hello.txt");

        // Read the entire file into a byte array
        byte[] bytes = Files.readAllBytes(helloFilePath);

        // Convert bytes into a String
        String allLines = new String(bytes);

        // Display all the text
        System.out.println("All lines\n" + allLines);

        // Remove carriage return characters (Windows)
        allLines = allLines.replace("\r", "");

        // Split the text into an array of Strings
        String[] lines = allLines.split("\n");

        // Display the array
        System.out.println(Arrays.toString(lines));
    }
}
