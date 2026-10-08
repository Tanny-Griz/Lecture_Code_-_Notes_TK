package w08_java_topic_5_hashmaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.intInput;

public class RoadTripPlanner {

    public static void main(String[] args) {

        // Create a HashMap
        // String = city name
        // Integer = distance from Minneapolis
        Map<String, Integer> distances = new HashMap<>();


        // Add city data
        distances.put("Duluth", 154);
        distances.put("Brainerd", 127);
        distances.put("Stillwater", 26);
        distances.put("Ely", 245);
        distances.put("Red Wing", 54);


        // Ask user for the maximum distance they want to drive
        int maxDistance = intInput("What is the maximum distance you want to drive?");


        System.out.println("Cities within " + maxDistance + " miles:");


        // Loop through all cities
        for (String city : distances.keySet()) {

            // Get the distance for the current city
            int distance = distances.get(city);

            // Print the city if it is within the user's driving range
            if (distance <= maxDistance) {

                System.out.println(city + ": " + distance + " miles");
            }
        }
    }
}