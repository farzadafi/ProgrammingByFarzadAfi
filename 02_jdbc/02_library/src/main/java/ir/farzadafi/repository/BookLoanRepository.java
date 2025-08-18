package ir.farzadafi.repository;

import ir.farzadafi.model.BookLoan;
import ir.farzadafi.utility.JdbcConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookLoanRepository {

    public int save(BookLoan bookLoan) throws SQLException {
        Connection connection = JdbcConnection.getConnection();
        String query = "INSERT INTO book_loan VALUES(?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, bookLoan.getBookId());
        preparedStatement.setInt(2, bookLoan.getUserId());
        preparedStatement.setDate(3, Date.valueOf(bookLoan.getDate()));
        return preparedStatement.executeUpdate();
    }
}
