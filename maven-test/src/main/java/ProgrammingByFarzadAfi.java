
import java.sql.*;
import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) throws SQLException {
        Connection connection =
                DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");

//        String table = "CREATE TABLE IF NOT EXISTS users(id SERIAL PRIMARY KEY, username VARCHAR)";
        Statement statement = connection.createStatement();
//        statement.execute(table);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your username:");
//        String username = scanner.nextLine();

//		String insert1 = "INSERT INTO users(username) VALUES('" + username + "')";
//		System.out.println(statement.executeUpdate(insert1));

        String insert1 = "INSERT INTO users(username) VALUES(?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert1);
//        preparedStatement.setString(1, username);
//        System.out.println(preparedStatement.executeUpdate());

        testStatement(statement);
        System.out.println();
        System.out.println();
        testPStatement(preparedStatement);
    }

    public static void testStatement(Statement statement) throws SQLException {
        System.out.println("statement:");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            String username = "person";
            String insert1 = "INSERT INTO users(username) VALUES('" + username + "')";
            statement.executeUpdate(insert1);
        }
        System.out.println((System.currentTimeMillis() - startTime) / 1000);
        System.out.println("===============================");
    }

    public static void testPStatement(PreparedStatement statement) throws SQLException {
        System.out.println("prepared statement:");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            String username = "person";
            statement.setString(1, username);
            statement.executeUpdate();
        }
        System.out.println((System.currentTimeMillis() - startTime) / 1000);
        System.out.println("===============================");
    }
}
