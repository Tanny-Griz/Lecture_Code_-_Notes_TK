package w09_java_topic_6_exceptions_and_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WritingAndReadingArrayList {
    public static void main(String[] args) throws IOException {

        String[] months = {"Jan", "Feb", "Mar"};

        BufferedWriter writer =
                new BufferedWriter(new FileWriter("months.txt"));

        // Write each month to the file
        for (String month : months) {
            writer.write(month + "\n");
        }

        writer.close();
    }
}
