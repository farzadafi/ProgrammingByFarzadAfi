package ir.farzadafi.repository;

import ir.farzadafi.model.BookLoan;
import ir.farzadafi.utility.JdbcConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}