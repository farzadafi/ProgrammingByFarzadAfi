package ir.farzadafi.model;

import java.time.LocalDate;

public class BookLoan {
    private int bookId;
    private int userId;
    private LocalDate date;
    private LocalDate returnDate;

    public BookLoan(int bookId, int userId, LocalDate date) {
        this.bookId = bookId;
        this.userId = userId;
        this.date = date;
    }

    public int getBookId() {
        return bookId;
    }

    public int getUserId() {
        return userId;
    }

    public LocalDate getDate() {
        return date;
    }
}
