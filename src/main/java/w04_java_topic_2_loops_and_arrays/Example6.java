package w04_java_topic_2_loops_and_arrays;

import static input.InputUtils.*;

public class Example6 {

    public static void main(String[] args) {
        double total = 0;

        for (int day = 0; day < 7; day++) {
            double dayExpense = doubleInput("On day " + (day + 1) + " of the week, what did you spend on bus fares?");
            total = total + dayExpense;
        }

        System.out.println("For the week, you spent $" + total + " for bus fares.");
    }

}
