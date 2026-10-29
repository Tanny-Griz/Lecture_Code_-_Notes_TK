package w10_java_topic_7_object_oriented_programming.swimming_pool;

public class Pool {

    private String name;
    private double length;

    Pool(String name, double length) { // constructor
        this.name = name;
        this.length = length;
    }

    public double distanceForLaps(int laps) { // method
        return laps * length;
    }
}
