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
                            "(id INTEGER PRIMARY KEY, name TEXT, stars INTEGER, watched BOOLEAN)"
            );

        } catch (SQLException e) {
            System.err.println("Error creating movie DB table because " + e);
        }
    }

    public void addNewMovie(Movie movie) {

        String insertSQL =
                "INSERT INTO movies (name, stars, watched) VALUES (?, ?, ?)";

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

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int stars = resultSet.getInt("stars");
                boolean watched = resultSet.getBoolean("watched");

                Movie movie = new Movie(id, name, stars, watched);

                movies.add(movie);
            }

        } catch (SQLException e) {
            System.err.println("Error getting movies: " + e);
        }

        return movies;
    }


    public List<Movie> getAllMoviesByWatched(boolean watchedStatus) {

        List<Movie> movies = new ArrayList<>();

        String sql = "SELECT * FROM movies WHERE watched = ?";

        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setBoolean(1, watchedStatus);

            try (ResultSet movieResults = preparedStatement.executeQuery()) {

                while (movieResults.next()) {


                    String name = movieResults.getString("name");
                    int stars = movieResults.getInt("stars");
                    boolean watched = movieResults.getBoolean("watched");

                    Movie movie = new Movie(name, stars, watched);
                    movies.add(movie);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error getting movies by watched status: " + e);
        }

        return movies;
    }


    public void updateMovie(Movie movie) {

        String sql = "UPDATE movies SET stars = ?, watched = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(3, movie.getId());
            preparedStatement.setBoolean(2, movie.isWatched());
            preparedStatement.setString(3, movie.getName());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error updating movie " + movie + " because " + e);
        }
    }


    public void deleteMovie(Movie movie) {

        String sql = "DELETE FROM movies WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, movie.getId());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error deleting movie: " + e);
        }
    }

    public List<Movie> search(String searchTerm) {

        List<Movie> movies = new ArrayList<>();

        String sql = "SELECT * FROM movies WHERE UPPER(name) LIKE UPPER(?)";

        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, "%" + searchTerm + "%");

            try (ResultSet results = preparedStatement.executeQuery()) {

                while (results.next()) {

                    String name = results.getString("name");
                    int stars = results.getInt("stars");
                    boolean watched = results.getBoolean("watched");

                    Movie movie = new Movie(name, stars, watched);
                    movies.add(movie);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error searching movies: " + e);
        }

        return movies;
    }



}
