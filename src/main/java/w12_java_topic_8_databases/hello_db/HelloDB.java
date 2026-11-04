package w12_java_topic_8_databases.hello_db;

import java.sql.*;

public class HelloDB {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:sqlite:hello.sqlite";

        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();
        String createTableSQL = "CREATE TABLE IF NOT EXISTS cats (name TEXT, age INTEGER)";
        statement.execute(createTableSQL);
        String insertDataSQL = "INSERT INTO cats VALUES ('Maru', 10)";
        statement.execute(insertDataSQL);
        insertDataSQL = "INSERT INTO cats VALUES ('Hello Kitty', 40)";
        statement.execute(insertDataSQL);
        insertDataSQL = "INSERT INTO cats VALUES ('Snowball', 12)";
        statement.execute(insertDataSQL);

        String getAllDataSQL = "SELECT * FROM cats";
        ResultSet allCats = statement.executeQuery(getAllDataSQL);
        while (allCats.next()) {

            String name = allCats.getString("name");
            int age = allCats.getInt("age");

            System.out.println(name + " is " + age + " years old.");
        }

        System.out.println("Cats table created!");

        System.out.println("Connected to database!");

        allCats.close();
        statement.close();
        connection.close();

    }

}