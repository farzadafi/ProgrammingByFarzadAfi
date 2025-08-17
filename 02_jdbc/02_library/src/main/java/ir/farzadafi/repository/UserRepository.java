package ir.farzadafi.repository;

import ir.farzadafi.model.User;
import ir.farzadafi.utility.JdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {

    public int save(User user) throws SQLException {
        Connection connection = JdbcConnection.getConnection();
        String query = "INSERT INTO users(name, national_code) VALUES(?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getNationalCode());
        return preparedStatement.executeUpdate();
    }

    public boolean isExistsNationalCode(String nationalCode) throws SQLException {
        Connection connection = JdbcConnection.getConnection();
        String query = "SELECT * FROM users u WHERE u.national_code = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, nationalCode);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }
}
