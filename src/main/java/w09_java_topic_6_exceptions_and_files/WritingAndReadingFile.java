package w09_java_topic_6_exceptions_and_files;

import java.io.*;

public class WritingAndReadingFile {
    public static void main(String[] args) throws IOException {

        // STEP 1: Write data to a file

        FileWriter writer = new FileWriter("student.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer);

        bufWriter.write("Tanya\n");
        bufWriter.write("Black\n");
        bufWriter.write("2545\n");

        bufWriter.close();


        // STEP 2: Read data from the file

        FileReader reader = new FileReader("student.txt");
        BufferedReader bufReader = new BufferedReader(reader);

        String line;

        while ((line = bufReader.readLine()) != null) {
            System.out.println(line);
        }

        bufReader.close();
    }
}
