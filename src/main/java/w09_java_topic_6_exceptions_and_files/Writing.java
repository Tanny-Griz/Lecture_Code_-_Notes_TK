package w09_java_topic_6_exceptions_and_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) throws IOException, IOException {

        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Hello");
        bufferedWriter.newLine();
        bufferedWriter.write("Tanya");

        bufferedWriter.close();
    }
}
