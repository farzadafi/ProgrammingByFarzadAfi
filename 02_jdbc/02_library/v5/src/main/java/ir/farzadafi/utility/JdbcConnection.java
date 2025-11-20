package ir.farzadafi.utility;

import ir.farzadafi.exception.DatabaseAccessException;

import java.sql.*;

public class JdbcConnection {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "postgres");
        } catch (SQLException e) {
            throw new DatabaseAccessException(e.getMessage());
        }
    }

    public static void closeResources(Connection connection,
                                      PreparedStatement preparedStatement,
                                      ResultSet resultSet) {
        try {
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void closeResources(Connection connection,
                                      PreparedStatement preparedStatement) {
        try {
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
