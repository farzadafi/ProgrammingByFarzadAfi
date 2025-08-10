package ir.farzadafi.repository;

import ir.farzadafi.model.User;

import java.sql.*;

public class UserRepository {

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "postgres");
    }

    public int save(User user) throws SQLException {
        Connection connection = getConnection();
        String query = "INSERT INTO users(name, age, username, password) VALUES(?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setInt(2, user.getAge());
        preparedStatement.setString(3, user.getUsername());
        preparedStatement.setString(4, user.getPassword());
        connection.close();
        return preparedStatement.executeUpdate();
    }

    public boolean isExistUsername(String username) throws SQLException {
        Connection connection = getConnection();
        String query = "SELECT * FROM users u WHERE u.username = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, username);
        ResultSet resultSet = preparedStatement.executeQuery();
        connection.close();
        return resultSet.next();
    }

    public User findByUsername(String username) throws SQLException {
        Connection connection = getConnection();
        String query = "SELECT * FROM users u WHERE u.username = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, username);
        ResultSet resultSet = preparedStatement.executeQuery();
        User user = null;
        if (resultSet.next()) {
            user = new User(resultSet.getString("name"),
                    resultSet.getInt("age"),
                    resultSet.getString("username"),
                    resultSet.getString("password"));
        }
        connection.close();
        return user;
    }

    public int updateName(String username, String newName) throws SQLException {
        Connection connection = getConnection();
        String query = "UPDATE users SET name = ? WHERE username = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, newName);
        preparedStatement.setString(2, username);
        int i = preparedStatement.executeUpdate();
        connection.close();
        return i;
    }
}
