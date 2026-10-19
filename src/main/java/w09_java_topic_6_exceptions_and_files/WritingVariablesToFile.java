package w09_java_topic_6_exceptions_and_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVariablesToFile {

    public static void main(String[] args) throws IOException {

        // Let's write some variables to a file
        FileWriter writer = new FileWriter("variables.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer);
        // BufferedWriter makes file writing faster and more efficient
        // by collecting data in memory and writing it to the file in
        // larger chunks instead of many small operations.

        int intData = 42;
        double dblData = 987.654;
        String strData = "Java";

        // Use BufferedWriter to write all the data to the file
        bufWriter.write(intData + "\n");
        bufWriter.write(dblData + "\n");
        bufWriter.write(strData + "\n");

        // Writing integers as Unicode characters
        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        bufWriter.write(data1);
        bufWriter.write(data2);
        bufWriter.write(data3); // CAT

        // Always close files when you are done working with them
        bufWriter.close();
    }
}
