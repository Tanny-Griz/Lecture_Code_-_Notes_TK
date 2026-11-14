package w12_java_topic_8_databases.movie_watchlist;


public class Movie {

    private String name;
    private int stars;
    private boolean watched;
    private int id;

    // For new movies (SQLite generates the ID)
    public Movie(String name, int stars, boolean watched) {
        this.name = name;
        this.stars = stars;
        this.watched = watched;
    }

    // For movies retrieved from the database (ID already exists)
    public Movie(int id, String name, int stars, boolean watched) {
        this.id = id;
        this.name = name;
        this.stars = stars;
        this.watched = watched;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }


    @Override
    public String toString() {
        return "ID: " + id + " | " + name
                + " | Stars: " + stars
                + " | Watched: " + watched;
    }
}
