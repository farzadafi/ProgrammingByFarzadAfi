package ir.farzadafi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
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
}
