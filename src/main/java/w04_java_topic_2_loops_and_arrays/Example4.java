package w04_java_topic_2_loops_and_arrays;

public class Example4 {

    public static void main(String[] args) {
        for (int oilChange = 1; oilChange <= 8; oilChange++) {
            int mileage = 150000 + oilChange * 3000;
            System.out.println("Get oil change at " + mileage + " miles");
        }
    }

}
