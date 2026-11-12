package w12_java_topic_8_databases.movie_watchlist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private final String databasePath;

    public Database(String databasePath) {
        this.databasePath = databasePath;

        try (Connection connection = DriverManager.getConnection(databasePath);
             Statement statement = connection.createStatement()) {

            statement.execute(
                    "CREATE TABLE IF NOT EXISTS movies " +
                            "(name TEXT, stars INTEGER, watched BOOLEAN)"
            );

        } catch (SQLException e) {
            System.err.println("Error creating movie DB table because " + e);
        }
    }

    public void addNewMovie(Movie movie) {

        String insertSQL = "INSERT INTO movies VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement =
                     connection.prepareStatement(insertSQL)) {

            preparedStatement.setString(1, movie.getName());
            preparedStatement.setInt(2, movie.getStars());
            preparedStatement.setBoolean(3, movie.isWatched());

            preparedStatement.execute();

        } catch (SQLException e) {
            System.err.println("Error adding movie " + movie + " because " + e);
        }
    }

    public List<Movie> getAllMovies() {

        List<Movie> movies = new ArrayList<>();

        String selectSQL = "SELECT * FROM movies ORDER BY name";

        try (Connection connection = DriverManager.getConnection(databasePath);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSQL)) {

            while (resultSet.next()) {

                String name = resultSet.getString("name");
                int stars = resultSet.getInt("stars");
                boolean watched = resultSet.getBoolean("watched");

                Movie movie = new Movie(name, stars, watched);

                movies.add(movie);
            }

        } catch (SQLException e) {
            System.err.println("Error getting movies: " + e);
        }

        return movies;
    }


}
