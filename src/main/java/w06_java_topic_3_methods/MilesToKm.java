package w06_java_topic_3_methods;

import static input.InputUtils.*;

public class MilesToKm {

    public static void main(String[] args) {

        double miles = doubleInput("Please enter number of miles");

        // Convert miles to kilometers
        double km = milesToKM(miles);

        System.out.println(miles + " miles is equal to " + km + " kilometers");
    }

    public static double milesToKM(double miles) {

        // One mile is 1.6 kilometers
        double km = miles * 1.6;

        return km;
    }
}
