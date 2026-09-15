package w04_java_topic_2_loops_and_arrays;

import java.text.NumberFormat;

import static input.InputUtils.*;

public class Example15 {

    public static void main(String[] args) {
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December"
        };

        double[] bills = new double[months.length];
        double total = 0;

        for (int month = 0; month < months.length; month++) {
            bills[month] = doubleInput("Enter the bill for " + months[month] + ": ");
            total = total + bills[month];
        }

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

        System.out.println("Month\t\tBill");

        for (int month = 0; month < months.length; month++) {
            System.out.println(months[month] + "\t\t" + currencyFormatter.format(bills[month]));
        }

        double average = total / bills.length;
        System.out.println("Total = " + currencyFormatter.format(total));
        System.out.println("Average payment = " + currencyFormatter.format(average));
    }

}
