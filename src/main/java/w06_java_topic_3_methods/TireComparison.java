package w06_java_topic_3_methods;

import static input.InputUtils.*;

public class TireComparison {

    public static void main(String[] args) {

        // Welcome
        System.out.println("Welcome to the Tire Price Comparison Calculator");

        // Ask how many tires
        int numberOfTires = positiveIntInput("Please enter the number of tires to compare");

        // Create array for reports
        String[] tireReports = new String[numberOfTires];

        // Get tire reports
        for (int t = 0; t < numberOfTires; t++) {
            String report = getTireInfo();
            tireReports[t] = report;
        }

        // Print all reports
        printReportTable(tireReports);
    }

    public static String getTireInfo() {

        // Get tire data
        String name = stringInput("What is the name of the tire?");
        double price = positiveDoubleInput("Enter the price of " + name);
        int mileWarranty = positiveIntInput("Enter the number of miles warranty");

        // Calculate price
        double dollarsPer1000Miles = calculatePricePer1000Miles(price, mileWarranty);

        return String.format("%s costs %f, has a %d mile warranty, costs $%.3f per 1000 miles",
                name, price, mileWarranty, dollarsPer1000Miles);
    }

    public static double calculatePricePer1000Miles(double price, double miles) {

        // Price per 1000 miles
        double pricePer1000Miles = price * 1000 / miles;

        return pricePer1000Miles;
    }

    public static void printReportTable(String[] tireReports) {

        // Print each report
        for (int t = 0; t < tireReports.length; t++) {
            System.out.println(tireReports[t]);
        }
    }
}
