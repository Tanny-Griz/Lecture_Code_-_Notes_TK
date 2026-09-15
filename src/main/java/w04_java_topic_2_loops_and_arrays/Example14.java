package w04_java_topic_2_loops_and_arrays;

public class Example14 {

    public static void main(String[] args) {
        String[] languages = {"Java", "Python", "C#"};
        int[] numbers = {2, 4, 6, 8, 10, 12};

        System.out.println("languages length = " + languages.length);

        for (int x = 0; x < numbers.length; x++) {
            System.out.println(numbers[x]);
        }
    }

}
