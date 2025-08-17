package ir.farzadafi.repository;

import ir.farzadafi.model.Book;
import ir.farzadafi.utility.DynamicArray;

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

    public boolean isExistByTitle(String title) throws SQLException {
        Connection connection = getConnection();
        String query = "SELECT * FROM book b WHERE b.title = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, title);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }

    public int updateQuantity(String title, int newQuantity) throws SQLException {
        Connection connection = getConnection();
        String query = "UPDATE book b SET quantity = ? WHERE b.title = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, newQuantity);
        preparedStatement.setString(2, title);
        return preparedStatement.executeUpdate();
    }

    public Book findByTitle(String title) throws SQLException {
        Connection connection = getConnection();
        String query = "SELECT * FROM book b WHERE b.title = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, title);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (!resultSet.next())
            return null;
        return getBookFromResultSet(resultSet);
    }

    private Book getBookFromResultSet(ResultSet rs) throws SQLException {
        Book book = new Book();
        book.setId(rs.getInt("id"));
        book.setTitle(rs.getString("title"));
        book.setAuthorName(rs.getString("author_name"));
        book.setPublishYear(rs.getInt("publish_year"));
        book.setQuantity(rs.getInt("quantity"));
        return book;
    }

    public DynamicArray findAllByAuthorName(String authorName) throws SQLException {
        Connection connection = getConnection();
        String query = "SELECT * FROM book b WHERE b.author_name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, authorName);
        ResultSet rs = preparedStatement.executeQuery();
        DynamicArray dynamicArray = new DynamicArray("Book");
        while(rs.next()){
            Book book = getBookFromResultSet(rs);
            dynamicArray.add(book);
        }
        return dynamicArray;
    }
}
