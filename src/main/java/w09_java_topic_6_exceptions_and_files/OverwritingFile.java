package w09_java_topic_6_exceptions_and_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OverwritingFile {
    public static void main(String[] args) throws IOException {

        // Create and open hello.txt for writing
        FileWriter writer = new FileWriter("hello.txt");

        // Wrap FileWriter in BufferedWriter
        BufferedWriter bufWriter = new BufferedWriter(writer);

        // Write some Strings.
        bufWriter.write("Hello\n");
        bufWriter.write("Data here\n");
        bufWriter.write("Goodbye\n");

        // close your file
        bufWriter.close();

        // If you want to access hello.txt again, you need to create a new
        // BufferedWriter and FileWriter
        // Since hello.txt already exists, it will be overwritten!
        writer = new FileWriter("hello.txt");

        // Wrap FileWriter in BufferedWriter
        bufWriter = new BufferedWriter(writer);

        // This will overwrite the previous data
        bufWriter.write("This data\n");
        bufWriter.write("overwrites the first set of data.\n");

        // As always, close your files when done writing.
        bufWriter.close();
    }
}
