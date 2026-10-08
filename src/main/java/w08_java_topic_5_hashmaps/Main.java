package w08_java_topic_5_hashmaps;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // A TreeMap is just like a HashMap but it keeps the keys in order,
        // regardless of the order the key-value pairs are added.
        // IF the keys are strings, they will be sorted alphabetically.
        Map<String, String> collegesAndCities = new TreeMap<>();

        collegesAndCities.put("Minneapolis College", "Minneapolis");
        collegesAndCities.put("Hennepin Technical College", "Brooklyn Park");
        collegesAndCities.put("Dakota County College", "Rosemount");
        collegesAndCities.put("Normandale Community College", "Bloomington");
        collegesAndCities.put("Inver Hills Community College", "Inver Grove Heights");
        collegesAndCities.put("Century College", "White Bear Lake");

        for (String college : collegesAndCities.keySet()) {
            String city = collegesAndCities.get(college);
            System.out.println(college + " is in " + city);
        }

        // FOR ME
        //  простые данные
        //→ Array / List / HashMap
        //
        // нужны уникальные значения
        //→ Set
        //
        // нужны отсортированные ключи
        //→ TreeMap / sorted Map
        //
        //  нужно несколько значений для одного key
        //→ HashMap<String, List<String>>
        //
        //  нужны сложные вложенные данные
        //→ комбинируем List, HashMap, arrays
        //
        //  данные становятся слишком сложными
        //→ создаём свой class


        // HASHMAP
        // Stores data as KEY -> VALUE pairs
        // Keys must be unique


        // 1. CREATE A HASHMAP
        // String = type of key
        // Integer = type of value

        HashMap<String, Integer> distances = new HashMap<>();


        // 2. ADD DATA
        // put(key, value)

        distances.put("Duluth", 154);
        distances.put("Brainerd", 127);
        distances.put("Stillwater", 26);
        distances.put("Ely", 245);
        distances.put("Red Wing", 54);


        // 3. PRINT THE WHOLE HASHMAP

        System.out.println(distances);


        // 4. GET A VALUE BY KEY
        // get(key)

        int duluthDistance = distances.get("Duluth");

        System.out.println("Distance to Duluth: " + duluthDistance);


        // 5. KEYS MUST BE UNIQUE
        // If the key already exists, the old value is replaced

        distances.put("Duluth", 160);

        System.out.println(distances.get("Duluth"));   // 160


        // 6. CHECK IF A KEY EXISTS
        // containsKey()

        if (distances.containsKey("Ely")) {
            System.out.println("Ely is in the HashMap.");
        }


        // 7. CHECK IF A VALUE EXISTS
        // containsValue()

        if (distances.containsValue(54)) {
            System.out.println("There is a city 54 miles away.");
        }


        // 8. NUMBER OF KEY-VALUE PAIRS
        // size()

        System.out.println("Number of cities: " + distances.size());


        // 9. CHECK IF HASHMAP IS EMPTY
        // isEmpty()

        System.out.println(distances.isEmpty());


        // 10. REMOVE A KEY-VALUE PAIR
        // remove(key)

        distances.remove("Ely");


        // LOOPS


        // 11. LOOP THROUGH KEYS
        // keySet()

        for (String city : distances.keySet()) {
            System.out.println(city);
        }


        // 12. LOOP THROUGH VALUES
        // values()

        for (Integer miles : distances.values()) {
            System.out.println(miles);
        }


        // 13. LOOP THROUGH KEYS AND VALUES

        for (String city : distances.keySet()) {

            Integer miles = distances.get(city);

            System.out.println(city + " -> " + miles + " miles");
        }


        // Alternative: entrySet()

        for (Map.Entry<String, Integer> entry : distances.entrySet()) {

            String city = entry.getKey();
            Integer miles = entry.getValue();

            System.out.println(city + " -> " + miles);
        }


        // EXAMPLE: ADD UP ALL VALUES

        int totalMiles = 0;

        for (Integer miles : distances.values()) {
            totalMiles += miles;
        }

        System.out.println("Total miles: " + totalMiles);


        // MAP.OF()
        // Creates an immutable Map
        // It cannot be changed after creation

        Map<String, Integer> cities = Map.of(
                "Duluth", 154,
                "Brainerd", 127,
                "Stillwater", 26
        );

        System.out.println(cities);


        // This would NOT work because Map.of() is immutable:
        // cities.put("Ely", 245);


        // IMPORTANT

        // HashMap does NOT guarantee order.

        // Keys are unique.
        // Values do NOT have to be unique.

        // HashMap can store many types:
        //
        // HashMap<String, Integer>
        // HashMap<String, Double>
        // HashMap<Integer, String>
        // HashMap<String, Boolean>
        //
        // Values can also be Lists, arrays,
        // other HashMaps, etc.


        // GENERICS

        // HashMap<String, Integer>
        //
        // String  = key type
        // Integer = value type
        //
        // Generics use reference types,
        // so we use Integer instead of int,
        // Double instead of double,
        // Boolean instead of boolean.


        // Other Data Structures Notes
        // 1. SET

        // Set stores UNIQUE values.
        // Duplicate values are not added.

        Set<String> genres = new HashSet<>();

        genres.add("One");
        genres.add("Two");
        genres.add("Two");     // Duplicate - will not be added

        System.out.println("Set:");
        System.out.println(genres);

        // List can contain duplicates.
        // Set contains unique values.

        // 2. SORTED MAP

        // TreeMap is one way to create a map whose keys are kept in sorted order.

        Map<String, Integer> scores = new TreeMap<>();

        scores.put("Tanya", 95);
        scores.put("Anna", 88);
        scores.put("John", 91);

        System.out.println("\nTreeMap:");

        for (String name : scores.keySet()) {
            System.out.println(name + ": " + scores.get(name));
        }

        // 3. HASHMAP WITH A LIST AS THE VALUE
        // One key can point to a whole List.

        Map<String, List<String>> foodGroups = new HashMap<>();

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Carrot");
        vegetables.add("Broccoli");
        vegetables.add("Cucumber");

        foodGroups.put("Fruits", fruits);
        foodGroups.put("Vegetables", vegetables);

        System.out.println("\nHashMap with Lists:");

        for (String group : foodGroups.keySet()) {
            System.out.println(group + " -> " + foodGroups.get(group));
        }

        // 4. HASHMAP WITH AN ARRAY AS THE VALUE

        Map<String, int[]> temperatures = new HashMap<>();

        temperatures.put("Monday", new int[]{60, 65, 62});
        temperatures.put("Tuesday", new int[]{58, 64, 61});

        System.out.println("\nHashMap with arrays:");

        int[] mondayTemperatures = temperatures.get("Monday");

        for (int temperature : mondayTemperatures) {
            System.out.println(temperature);
        }


        // 5. LIST OF HASHMAPS
        // A List can contain many HashMaps.

        List<HashMap<String, String>> users = new ArrayList<>();

        HashMap<String, String> user1 = new HashMap<>();
        user1.put("name", "Tanya");
        user1.put("city", "Minneapolis");

        HashMap<String, String> user2 = new HashMap<>();
        user2.put("name", "Anna");
        user2.put("city", "Chicago");

        users.add(user1);
        users.add(user2);

        System.out.println("\nList of HashMaps:");

        for (HashMap<String, String> user : users) {
            System.out.println(user);
        }

        // 6. HASHMAP OF HASHMAPS
        // One HashMap can contain another HashMap.

        Map<String, HashMap<String, Integer>> studentGrades =
                new HashMap<>();

        HashMap<String, Integer> tanyaGrades = new HashMap<>();

        tanyaGrades.put("Java", 95);
        tanyaGrades.put("SQL", 90);

        HashMap<String, Integer> annaGrades = new HashMap<>();

        annaGrades.put("Java", 88);
        annaGrades.put("SQL", 92);

        studentGrades.put("Tanya", tanyaGrades);
        studentGrades.put("Anna", annaGrades);

        System.out.println("\nHashMap of HashMaps:");

        System.out.println(studentGrades);

        // 7. EXTEND AN EXISTING DATA TYPE
        // We can create our own version of an existing type
        // and add our own methods.

        NameList names = new NameList();

        names.add("Tanya");
        names.add("Anna");
        names.add("John");

        System.out.println("\nCustom ArrayList:");

        names.printAllNames();

        // 8. CREATE YOUR OWN DATA TYPE
        // If the data becomes too complicated for a HashMap,
        // we can create our own class.

        // CUSTOM DATA TYPE
        class User {
            String name;
            int age;
            String email;
            boolean active;
        }

        User person1 = new User();

        person1.name = "Tanya";
        person1.age = 36;
        person1.email = "tanya@example.com";
        person1.active = true;

        User person2 = new User();

        person2.name = "Anna";
        person2.age = 28;
        person2.email = "anna@example.com";
        person2.active = false;

        // Now we can create a List of User objects.
        List<User> userObjects = new ArrayList<>();

        userObjects.add(person1);
        userObjects.add(person2);

        System.out.println("\nList of User objects:");

        for (User user : userObjects) {
            System.out.println(user.name + ", " + user.age + ", " + user.email + ", active: " + user.active);
        }
    }

    // EXTENDING AN EXISTING TYPE
    static class NameList extends ArrayList<String> {

        public void printAllNames() {
            for (String name : this) {
                System.out.println(name);
            }
        }

    }

}
