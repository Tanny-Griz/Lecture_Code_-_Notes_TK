package w04_java_topic_2_loops_and_arrays;

import static input.InputUtils.*;

public class Example5 {

    public static void main(String[] args) {
        int numberOfTests = 5;
        double testScore;
        double testScoreSum = 0.0;
        double testScoreAverage;

        for (int test = 1; test <= numberOfTests; test++) {
            testScore = doubleInput("Enter test score #" + test);
            testScoreSum = testScoreSum + testScore;
        }

        testScoreAverage = testScoreSum / numberOfTests;
        System.out.println("Average score = " + testScoreAverage);
    }

}
