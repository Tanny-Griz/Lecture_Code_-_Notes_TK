package w08_java_topic_5_hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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

        for (String college: collegesAndCities.keySet()) {
            String city = collegesAndCities.get(college);
            System.out.println(college + " is in " + city);
        }

        // --------------------------------------------------
        // HASHMAP
        // Stores data as KEY -> VALUE pairs
        // Keys must be unique
        // --------------------------------------------------


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


        // --------------------------------------------------
        // LOOPS
        // --------------------------------------------------


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


        // --------------------------------------------------
        // EXAMPLE: ADD UP ALL VALUES
        // --------------------------------------------------

        int totalMiles = 0;

        for (Integer miles : distances.values()) {
            totalMiles += miles;
        }

        System.out.println("Total miles: " + totalMiles);


        // --------------------------------------------------
        // MAP.OF()
        // Creates an immutable Map
        // It cannot be changed after creation
        // --------------------------------------------------

        Map<String, Integer> cities = Map.of(
                "Duluth", 154,
                "Brainerd", 127,
                "Stillwater", 26
        );

        System.out.println(cities);


        // This would NOT work because Map.of() is immutable:
        // cities.put("Ely", 245);


        // --------------------------------------------------
        // IMPORTANT
        // --------------------------------------------------

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


        // --------------------------------------------------
        // GENERICS
        // --------------------------------------------------

        // HashMap<String, Integer>
        //
        // String  = key type
        // Integer = value type
        //
        // Generics use reference types,
        // so we use Integer instead of int,
        // Double instead of double,
        // Boolean instead of boolean.
    }

}
