package w04_java_topic_2_loops_and_arrays;

public class Example13 {

    public static void main(String[] args) {
        int[] scores = new int[10];

        scores[0] = 98;
        scores[7] = 76;
        scores[4] = 54; // Can edit in any order
        scores[9] = 98; // The last element

        // scores[10] = 87; // ERROR
        // scores[-1] = 92; // ERROR
    }

}
