package ir.farzadafi.repository;

import ir.farzadafi.exception.JdbcQueryException;
import ir.farzadafi.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static ir.farzadafi.utility.JdbcConnection.closeResources;
import static ir.farzadafi.utility.JdbcConnection.getConnection;

public class UserRepository {

    public int save(User user) {
        String query = "INSERT INTO users(name, national_code) VALUES(?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getNationalCode());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new JdbcQueryException(e.getMessage());
        }
    }

    public boolean isExistsNationalCode(String nationalCode) {
        String query = "SELECT * FROM users u WHERE u.national_code = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, nationalCode);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            throw new JdbcQueryException(e.getMessage());
        }
    }

    public int getIdByNationalCode(String nationalCode) throws SQLException {
        Connection connection = getConnection();
        String query = "SELECT u.id FROM users u WHERE u.national_code = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, nationalCode);
        ResultSet resultSet = preparedStatement.executeQuery();
        int result;
        if (!resultSet.next())
            result = -1;
        else
            result = resultSet.getInt("id");
        closeResources(connection, preparedStatement, resultSet);
        return result;
    }
}
