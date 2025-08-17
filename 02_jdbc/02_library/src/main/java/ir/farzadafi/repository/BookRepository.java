package ir.farzadafi.repository;

import ir.farzadafi.model.Book;

import java.sql.*;

public class BookRepository {

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "postgres");
    }

    public int save(Book book) throws SQLException {
        Connection connection = getConnection();
        String query = "INSERT INTO book(title, author_name, publish_year, quantity)" +
                " VALUES(?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, book.getTitle());
        preparedStatement.setString(2, book.getAuthorName());
        preparedStatement.setInt(3, book.getPublishYear());
        preparedStatement.setInt(4, book.getQuantity());
        return preparedStatement.executeUpdate();
    }

    public boolean isExistByTitle(String title) throws SQLException{
        Connection connection = getConnection();
        String query = "SELECT * FROM book b WHERE b.title = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, title);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }
}
