package w04_java_topic_2_loops_and_arrays;

import java.text.NumberFormat;

import static input.InputUtils.*;

public class Example9 {

    public static void main(String[] args) {
        boolean moreCalculations = true;
        double price;
        double salesTax = 1.07;

        while (moreCalculations) {
            price = doubleInput("Type in a price");
            double priceInclTax = price * salesTax;
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
            String formattedPrice = currencyFormatter.format(priceInclTax);
            System.out.println("The price plus sales tax is " + formattedPrice);

            moreCalculations = yesNoInput("Do you want to continue?");
        }

        System.out.println("Thanks for using the program - goodbye!");
    }

}
