package w10_java_topic_7_object_oriented_programming.swimming_pool;

public class Main {

    public static void main(String[] args) {

        Pool como = new Pool("Como Park", 25);
        Pool ymca = new Pool("YMCA Downtown", 20);

        double distance = como.distanceForLaps(5);

        System.out.println(distance);
    }
}
