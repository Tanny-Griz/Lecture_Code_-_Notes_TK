package w08_java_topic_5_hashmaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.stringInput;

public class SnowfallHashMap {

    public static void main(String[] args) {

        // Create a HashMap
        // String = month
        // Double = snowfall amount
        Map<String, Double> snowfall = new HashMap<>();


        // Add snowfall data
        // Store month names in uppercase
        snowfall.put("MARCH", 4.1);
        snowfall.put("APRIL", 0.0);

        System.out.println("Snowfall data:");

        for (String month : snowfall.keySet()) {

            double amount = snowfall.get(month);

            System.out.println(month + ": " + amount + " inches");
        }


        // 1
        // Add all snowfall amounts

        double total = 0;

        for (Double amount : snowfall.values()) {
            total += amount;
        }

        System.out.println("Total snowfall: " + total + " inches");


        // 2 + 3
        // Ask for a month and check if it already exists

        String month = stringInput("Enter a month").toUpperCase();


        // Keep asking until the user enters a new month
        while (snowfall.containsKey(month)) {

            System.out.println(month + " is already in the HashMap.");

            month = stringInput("Enter a different month").toUpperCase();
        }


        // Ask for snowfall only after a new month is entered
        double snowfallAmount = Double.parseDouble(
                stringInput("Enter snowfall amount")
        );


        // Add the new month and snowfall amount
        snowfall.put(month, snowfallAmount);

        System.out.println("New data added.");

        System.out.println("\nUpdated snowfall data:");

        for (String currentMonth : snowfall.keySet()) {

            double currentAmount = snowfall.get(currentMonth);

            System.out.println(currentMonth + ": " + currentAmount + " inches");
        }
    }
}