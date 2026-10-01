package w07_java_topic_4_lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import static input.InputUtils.stringInput;

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

        List<Integer> numbers = new ArrayList<>();

        List<Boolean> results = new ArrayList<>();

        List<Double> prices = new ArrayList<>();

        /*
        Generics <> specify what type of data a List can store.
        This makes the code safer because Java only allows the specified type.

        Examples:
        List<String>  - stores Strings
        List<Integer> - stores Integers
        List<Double>  - stores Doubles
        List<Boolean> - stores Booleans

        For primitive types, use wrapper classes:
        int -> Integer
        double -> Double
        boolean -> Boolean
        */

        List<Integer> numbers2 = new ArrayList<>();

        numbers2.add(100);
        numbers2.add(5);
        numbers2.add(42);
        numbers2.add(71);

        System.out.println(numbers2);

        List<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("Inf");
        cars.add("Alfa");

        System.out.println(cars.get(2)); // Audi

        cars.remove(2);
        cars.remove("BMW");

        System.out.println(cars); // [Audi, Lexus, Inf, Alfa]

        cars.set(3, "Honda");
        System.out.println(cars); // [Audi, Lexus, Inf, Honda]

        if (cars.contains("Inf")) {
            System.out.println("Inf is in the list");
        }

        System.out.println(cars.size());

        // cars.clear();

        System.out.println(cars.isEmpty()); // false

        for (String car : cars) {
            System.out.println(car);
        }

        // todolist
        List<String> todoList = new ArrayList<>();

        while (true) {
            String data = stringInput("Enter task, or press Enter to quit");

            if (data.length() == 0) {
                break;
            }

            if (todoList.contains(data)) {
                System.out.println("This task is already in the list.");
            } else {
                todoList.add(data);
            }
        }

        for (String task : todoList) {
            System.out.println(task);
        }

        System.out.println("Total tasks: " + todoList.size());







    }


}
