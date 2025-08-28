package ir.farzadafi.utility;

import java.sql.*;

public class JdbcConnection {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "postgres");
    }

    public static void closeResources(Connection connection,
                                PreparedStatement preparedStatement,
                                ResultSet resultSet) throws SQLException {
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

    public static void closeResources(Connection connection,
                                       PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
        connection.close();
    }
}
