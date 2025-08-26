package ir.farzadafi.repository;

import ir.farzadafi.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static ir.farzadafi.utility.JdbcConnection.closeResources;
import static ir.farzadafi.utility.JdbcConnection.getConnection;

public class UserRepository {

    public int save(User user) throws SQLException {
        Connection connection = getConnection();
        String query = "INSERT INTO users(name, national_code) VALUES(?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getNationalCode());
        int i = preparedStatement.executeUpdate();
        closeResources(connection, preparedStatement);
        return i;
    }



    public boolean isExistsNationalCode(String nationalCode) throws SQLException {
        Connection connection = getConnection();
        String query = "SELECT * FROM users u WHERE u.national_code = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, nationalCode);
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean next = resultSet.next();
        closeResources(connection, preparedStatement, resultSet);
        return next;
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
