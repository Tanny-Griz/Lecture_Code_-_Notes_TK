package w12_java_topic_8_databases.movie_watchlist;


import java.util.List;

import static input.InputUtils.*;

public class MovieList {

    public static Database database;

    public static void main(String[] args) {

        String databasePath = "JDBC:sqlite:movie_watchlist.sqlite";

        database = new Database(databasePath);

//         Movie movie = new Movie(1,"Doctor Strange", 3, true);
//         database.addNewMovie(movie);
//         System.out.println("Movie added!");

//        Movie movie = new Movie("Interstellar", 0, false);
//        database.addNewMovie(movie);

        displayAllMovies();
        checkIfWatchedAndRate();
        deleteWatchedMovies();
        searchMovies();
    }

    private static void displayAllMovies() {

        List<Movie> allMovies = database.getAllMovies();

        for (Movie movie : allMovies) {
            System.out.println(movie);
        }
    }


    private static void checkIfWatchedAndRate() {

        // Get all unwatched movies
        List<Movie> unwatchedMovies = database.getAllMoviesByWatched(false);

        for (Movie movie : unwatchedMovies) {

            boolean hasWatched = yesNoInput(
                    "Have you watched " + movie.getName() + "?"
            );

            if (hasWatched) {

                int stars = intInput(
                        "What is your rating for " + movie.getName()
                                + " out of 5 stars?"
                );

                movie.setWatched(true);
                movie.setStars(stars);

                database.updateMovie(movie);
            }
        }
    }


    private static void deleteWatchedMovies() {

        List<Movie> watchedMovies = database.getAllMoviesByWatched(true);

        for (Movie movie : watchedMovies) {

            boolean delete = yesNoInput(
                    "Delete " + movie.getName() + "?"
            );

            if (delete) {
                database.deleteMovie(movie);
            }
        }
    }


    private static void searchMovies() {

        String searchTerm = stringInput("Enter a movie name to search for:");

        List<Movie> matchingMovies = database.search(searchTerm);

        if (matchingMovies.isEmpty()) {
            System.out.println("No matching movies found.");
        } else {
            for (Movie movie : matchingMovies) {
                System.out.println(movie);
            }
        }
    }

}
