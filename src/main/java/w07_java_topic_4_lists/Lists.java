package w07_java_topic_4_lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lists {
        /*
        | Operation                    | ArrayList   | LinkedList     |
        |------------------------------|-------------|----------------|
        | Add to the end               | Very fast   | Fast           |
        | Add in the middle            | Slow        | Fairly fast    |
        | Add at the start             | Very slow   | Fast           |
        | Search for an item           | Fast        | Fast           |
        | Remove from the end          | Very fast   | Fast           |
        | Remove from the middle       | Slow        | Fairly fast    |
        | Remove from the start        | Slow        | Fast           |
        | Looping                      | Fast        | Almost as fast |
        | Extra storage needed         | Minimal     | More           |
        */

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World");

        // Add your name
        arrayList.add("Tanya");

        // Add MCTC
        arrayList.add("MCTC");

        // Print all Strings
        for (String s : arrayList) {
            System.out.println(s);
        }

        // Print all Strings in uppercase
        for (String s : arrayList) {
            System.out.println(s.toUpperCase());
        }

        // Print the length of each String
        for (String s : arrayList) {
            System.out.println(s.length());
        }

        //        Java Lists
        //        Vector
        List<String> vector = new Vector<>();

        vector.add("Hello");
        vector.add("World");

        for (String s : vector) {
            System.out.println(s);
        }

        // ArrayList
        List<String> arrayListA = new ArrayList<>();

        arrayListA.add("Hello");
        arrayListA.add("World");

        for (String s : arrayListA) {
            System.out.println(s);
        }

        // LinkedList
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Hello");
        linkedList.add("World");

        for (String s : linkedList) {
            System.out.println(s);
        }



    }


}
