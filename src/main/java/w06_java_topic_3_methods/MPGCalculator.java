package w06_java_topic_3_methods;

import static input.InputUtils.*;

public class MPGCalculator {

    public static void main(String[] args) {

        // Get miles
        double miles = doubleInput("Please enter number of miles driven");

        // Get gallons
        double gallons = doubleInput("Please enter gallons of gas used");

        // Calculate MPG
        double mpg = calculateMPG(miles, gallons);

        // Print MPG
        System.out.println("The MPG is " + mpg);
    }

    public static double calculateMPG(double miles, double gallons) {

        // Miles per gallon
        double mpg = miles / gallons;

        return mpg;
    }
}
