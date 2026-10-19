package w09_java_topic_6_exceptions_and_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendingToFile {

    public static void main(String[] args) throws IOException {

        // Create and open hello.txt for writing
        FileWriter writer = new FileWriter("hello.txt");

        // Wrap FileWriter in BufferedWriter
        BufferedWriter bufWriter = new BufferedWriter(writer);

        // Write some Strings.
        bufWriter.write("Hello\n");
        bufWriter.write("Data here\n");
        bufWriter.write("Goodbye\n");

        // close your file. Closing the BufferedWriter will also close
        // the FileWriter that it wraps and close hello.txt.
        bufWriter.close();

        // If you want to access hello.txt again, you need to create a new
        // BufferedWriter and FileWriter

        // If you want to add more data to the end of hello.txt,
        // create the FileWriter in append mode.
        // Notice the second argument? That's whether to append data or not
        // Setting it to true means that the original hello.txt will be kept
        // and extra lines will be written to the end of hello.txt.

        writer = new FileWriter("hello.txt", true);

        // new FileWriter("hello.txt", true);  // Adds data to the end
        // new FileWriter("hello.txt", false); // Overwrites existing data

        // Wrap FileWriter in BufferedWriter
        bufWriter = new BufferedWriter(writer);

        // This will be added at the end of the existing file
        bufWriter.write("This data 345\n");
        bufWriter.write("is appended to the end the first set of data.\n");

        // As always, close your files when done writing.
        bufWriter.close();
    }
}