package w06_java_topic_3_methods;

public class JJ {
    public static void main(String[] args) {

        int starsOutOfTen = 8;

        starsOutOfTen = getStarsOutOfTen(starsOutOfTen);

        System.out.println(starsOutOfTen);
    }

    public static int getStarsOutOfTen(int stars) {
        stars = 10;
        return stars;
    }
}
