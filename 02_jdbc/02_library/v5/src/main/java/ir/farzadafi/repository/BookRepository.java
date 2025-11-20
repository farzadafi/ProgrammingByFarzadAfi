package ir.farzadafi.repository;

import ir.farzadafi.dto.UnReturnedBook;
import ir.farzadafi.model.Book;
import ir.farzadafi.utility.DynamicArray;
import ir.farzadafi.utility.JdbcConnection;

import java.sql.*;
import java.time.LocalDate;

import static ir.farzadafi.utility.JdbcConnection.getConnection;
import static ir.farzadafi.utility.JdbcConnection.closeResources;

public class BookRepository {

    public int save(Book book) throws SQLException {
        Connection connection = getConnection();
        String query = """
                INSERT INTO book(title, author_name, publish_year, quantity)
                VALUES(?, ?, ?, ?)""";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, book.getTitle());
        preparedStatement.setString(2, book.getAuthorName());
        preparedStatement.setInt(3, book.getPublishYear());
        preparedStatement.setInt(4, book.getQuantity());
        int result = preparedStatement.executeUpdate();
        closeResources(connection, preparedStatement);
        return result;
    }

    public boolean isExistByTitle(String title) throws SQLException {
        Connection connection = getConnection();
        String query = "SELECT * FROM book b WHERE b.title = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, title);
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean result = resultSet.next();
        closeResources(connection, preparedStatement, resultSet);
        return result;
    }

    public int updateQuantity(String title, int newQuantity) throws SQLException {
        Connection connection = getConnection();
        String query = "UPDATE book b SET quantity = ? WHERE b.title = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, newQuantity);
        preparedStatement.setString(2, title);
        int result = preparedStatement.executeUpdate();
        closeResources(connection, preparedStatement);
        return result;
    }

    public Book findByTitle(String title) throws SQLException {
        Connection connection = getConnection();
        String query = "SELECT * FROM book b WHERE b.title = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, title);
        ResultSet resultSet = preparedStatement.executeQuery();
        Book book;
        if (!resultSet.next())
            book = null;
        else
            book = getBookFromResultSet(resultSet);
        closeResources(connection, preparedStatement, resultSet);
        return book;
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
        while (rs.next()) {
            Book book = getBookFromResultSet(rs);
            dynamicArray.add(book);
        }
        closeResources(connection, preparedStatement, rs);
        return dynamicArray;
    }

    public int minesOneFromQuantity(String title) throws SQLException {
        Connection connection = getConnection();
        String query = "UPDATE book b SET quantity = b.quantity - 1 WHERE b.title = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, title);
        int result = preparedStatement.executeUpdate();
        closeResources(connection, preparedStatement);
        return result;
    }

    public int plusOneFromQuantity(String title) throws SQLException {
        Connection connection = getConnection();
        String query = "UPDATE book b SET quantity = b.quantity + 1 WHERE b.title = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, title);
        int result = preparedStatement.executeUpdate();
        closeResources(connection, preparedStatement);
        return result;
    }

    public DynamicArray listUnReturnedBook() throws SQLException {
        Connection connection = getConnection();
        String query = """
                SELECT b.title, bl.date
                FROM book b INNER JOIN book_loan bl
                ON b.id = bl.book_id AND bl.return_date IS NULL""";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        DynamicArray unReturnedBooks = new DynamicArray("UnReturnedBook");
        while (resultSet.next()) {
            LocalDate borrowDate = resultSet.getDate("date").toLocalDate();
            String title = resultSet.getString("title");
            unReturnedBooks.add(new UnReturnedBook(title, borrowDate));
        }
        closeResources(connection, preparedStatement);
        return unReturnedBooks;
    }

    public int remove(int bookId) throws SQLException {
        Connection connection = getConnection();
        String query = "DELETE FROM book WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, bookId);
        int result = preparedStatement.executeUpdate();
        closeResources(connection, preparedStatement);
        return result;
    }
}
