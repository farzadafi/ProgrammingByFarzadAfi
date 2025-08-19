package ir.farzadafi.repository;

import ir.farzadafi.dto.UnReturnedBook;
import ir.farzadafi.model.BookLoan;
import ir.farzadafi.utility.DynamicArray;
import ir.farzadafi.utility.JdbcConnection;

import java.sql.*;
import java.time.LocalDate;

public class BookLoanRepository {

    public int save(BookLoan bookLoan) throws SQLException {
        Connection connection = JdbcConnection.getConnection();
        String query = "INSERT INTO book_loan(book_id, user_id, date) VALUES(?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, bookLoan.getBookId());
        preparedStatement.setInt(2, bookLoan.getUserId());
        preparedStatement.setDate(3, Date.valueOf(bookLoan.getDate()));
        return preparedStatement.executeUpdate();
    }

    public int setReturnDateBook(int bookId,
                                 int userId,
                                 LocalDate returnDate) throws SQLException {
        Connection connection = JdbcConnection.getConnection();
        String query = "UPDATE book_loan SET return_date = ? " +
                "WHERE book_id = ? AND user_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setDate(1, Date.valueOf(returnDate));
        preparedStatement.setInt(2, bookId);
        preparedStatement.setInt(3, userId);
        return preparedStatement.executeUpdate();
    }

    public DynamicArray listUnReturnedBookByUserNationalCode(String nationalCode)
            throws SQLException {
        Connection connection = JdbcConnection.getConnection();
        String query = "SELECT b.title, bl.date " +
                "FROM book_loan bl " +
                "INNER JOIN book b ON bl.book_id = b.id " +
                "INNER JOIN users u ON bl.user_id = u.id " +
                "WHERE bl.return_date IS NULL AND u.national_code = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, nationalCode);
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