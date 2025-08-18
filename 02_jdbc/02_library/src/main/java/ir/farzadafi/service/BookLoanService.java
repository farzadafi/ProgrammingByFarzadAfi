package ir.farzadafi.service;

import ir.farzadafi.dto.BookWithBooleanQuantity;
import ir.farzadafi.model.BookLoan;
import ir.farzadafi.repository.BookLoanRepository;

import java.sql.SQLException;
import java.time.LocalDate;

public class BookLoanService {
    private final UserService userService = new UserService();
    private final BookService bookService = new BookService();
    private final BookLoanRepository bookLoanRepository = new BookLoanRepository();

    public int loanBook(String nationalCode, String bookTitle) throws SQLException {
        int userId = userService.getIdByNationalCode(nationalCode);
        if (userId == -1)
            return -1;
        BookWithBooleanQuantity bookByTitle = bookService.findBookByTitle(bookTitle);
        if (bookByTitle == null)
            return -2;
        if(!bookByTitle.hasQuantity())
            return -3;
        BookLoan bookLoan = new BookLoan(bookByTitle.id(), userId, LocalDate.now());
        bookLoanRepository.save(bookLoan);
        return bookService.minesOneFromBookQuantity(bookTitle);
    }

    public int returnBook(String nationalCode, String bookTitle) throws SQLException {
        int userId = userService.getIdByNationalCode(nationalCode);
        BookWithBooleanQuantity book = bookService.findBookByTitle(bookTitle);
        bookLoanRepository.setReturnDateBook(book.id(), userId, LocalDate.now());
        return bookService.plusOneFromBookQuantity(bookTitle);
    }
}
