package w06_java_topic_3_methods;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] sponsors = {"ikea", "at&t", "cvs", "3m"};

        // Change each name to uppercase
        for (int i = 0; i < sponsors.length; i++) {
            sponsors[i] = sponsors[i].toUpperCase();
        }

        System.out.println(Arrays.toString(sponsors));

        double marathonDistance = 26.2;
        double weeklyDistance = 1.0;
        int week = 1;

        // Run until marathon distance
        while (weeklyDistance < marathonDistance) {
            System.out.printf("Week %d: %.2f miles%n", week, weeklyDistance);
            weeklyDistance = weeklyDistance * 1.10;
            week++;
        }

        System.out.printf("Week %d: %.2f miles%n", week, weeklyDistance);
        System.out.println("It will take " + week + " weeks to run a marathon.");

    }

}
// J3 - Lecture Code and Notes
