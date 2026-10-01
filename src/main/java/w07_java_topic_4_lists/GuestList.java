package w07_java_topic_4_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuestList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Create an empty guest list
        List<String> guestList = new ArrayList<>();

        // 2. Ask the user to enter guest names
        while (true) {

            System.out.print("Enter guest name or press Enter to stop: ");
            String name = scanner.nextLine();

            // Press Enter to stop adding guests
            if (name.isEmpty()) {
                break;
            }

            // Prevent duplicate names
            if (guestList.contains(name)) {
                System.out.println("This guest is already in the list.");
            } else {
                guestList.add(name);
            }
        }

        // 3. Sort names alphabetically
        Collections.sort(guestList);

        // 4. Print all guest names
        System.out.println("\nGuest list:");

        for (String guest : guestList) {
            System.out.println(guest);
        }

        // 5. Ask the user if they want to remove guests
        while (!guestList.isEmpty()) {

            System.out.print("\nEnter a name to remove or press Enter to stop: ");
            String name = scanner.nextLine();

            // Press Enter to stop removing guests
            if (name.isEmpty()) {
                break;
            }

            // Check that the guest exists before removing
            if (guestList.contains(name)) {
                guestList.remove(name);
                System.out.println(name + " was removed.");
            } else {
                System.out.println("Guest not found.");
            }
        }

        // 6. Print the guest list again
        System.out.println("\nUpdated guest list:");

        for (String guest : guestList) {
            System.out.println(guest);
        }

        // 7. Print total number of guests
        System.out.println("\nTotal guests: " + guestList.size());

        // 9. Select a random guest to win a prize
        if (!guestList.isEmpty()) {

            Random random = new Random();

            int randomIndex = random.nextInt(guestList.size());
            String winner = guestList.get(randomIndex);

            System.out.println("Prize winner: " + winner);
        } else {
            System.out.println("There are no guests to select a winner.");
        }

        scanner.close();
    }
}