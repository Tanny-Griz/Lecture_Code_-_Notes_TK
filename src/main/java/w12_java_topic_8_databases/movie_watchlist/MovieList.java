package w12_java_topic_8_databases.movie_watchlist;


import java.util.List;

public class MovieList {

    public static Database database;

    public static void main(String[] args) {

        String databasePath = "JDBC:sqlite:movie_watchlist.sqlite";

        database = new Database(databasePath);

        // Movie movie = new Movie("Doctor Strange", 3, true);
        // database.addNewMovie(movie);
        // System.out.println("Movie added!");

        displayAllMovies();
    }

    private static void displayAllMovies() {

        List<Movie> allMovies = database.getAllMovies();

        for (Movie movie : allMovies) {
            System.out.println(movie);
        }
    }

}
