package w06_java_topic_3_methods;

import java.util.Arrays;

public class MakeArrayUppercase {

    public static void main(String[] args) {

        // Create example array
        String[] sponsors = {"ikea", "at&t", "cvs", "3m"};

        // Change array to uppercase
        makeArrayUppercase(sponsors);

        // Print array
        System.out.println(Arrays.toString(sponsors)); //
    }

    public static void makeArrayUppercase(String[] words) {

        // Change each word
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toUpperCase();
        }
    }
}
