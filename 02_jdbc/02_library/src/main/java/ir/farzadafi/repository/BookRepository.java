package ir.farzadafi.repository;

import ir.farzadafi.dto.UnReturnedBook;
import ir.farzadafi.model.Book;
import ir.farzadafi.utility.DynamicArray;
import ir.farzadafi.utility.JdbcConnection;

import java.sql.*;
import java.time.LocalDate;

public class BookRepository {

    public int save(Book book) throws SQLException {
        Connection connection = JdbcConnection.getConnection();
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
        Connection connection = JdbcConnection.getConnection();
        String query = "SELECT * FROM book b WHERE b.title = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, title);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }

    public int updateQuantity(String title, int newQuantity) throws SQLException {
        Connection connection = JdbcConnection.getConnection();
        String query = "UPDATE book b SET quantity = ? WHERE b.title = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, newQuantity);
        preparedStatement.setString(2, title);
        return preparedStatement.executeUpdate();
    }

    public Book findByTitle(String title) throws SQLException {
        Connection connection = JdbcConnection.getConnection();
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
        Connection connection = JdbcConnection.getConnection();
        String query = "SELECT * FROM book b WHERE b.author_name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, authorName);
        ResultSet rs = preparedStatement.executeQuery();
        DynamicArray dynamicArray = new DynamicArray("Book");
        while (rs.next()) {
            Book book = getBookFromResultSet(rs);
            dynamicArray.add(book);
        }
        return dynamicArray;
    }

    public int minesOneFromQuantity(String title) throws SQLException {
        Connection connection = JdbcConnection.getConnection();
        String query = "UPDATE book b SET quantity = b.quantity - 1 WHERE b.title = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, title);
        return preparedStatement.executeUpdate();
    }

    public int plusOneFromQuantity(String title) throws SQLException {
        Connection connection = JdbcConnection.getConnection();
        String query = "UPDATE book b SET quantity = b.quantity + 1 WHERE b.title = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, title);
        return preparedStatement.executeUpdate();
    }

    public DynamicArray listUnReturnedBook() throws SQLException {
        Connection connection = JdbcConnection.getConnection();
        String query = "SELECT b.title, bl.date " +
                "FROM book b INNER JOIN book_loan bl " +
                "ON b.id = bl.book_id AND bl.return_date IS NULL";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        DynamicArray unReturnedBooks = new DynamicArray("UnReturnedBook");
        while (resultSet.next()) {
            LocalDate borrowDate = resultSet.getDate("date").toLocalDate();
            String title = resultSet.getString("title");
            unReturnedBooks.add(new UnReturnedBook(title, borrowDate));
        }
        return unReturnedBooks;
    }
}
