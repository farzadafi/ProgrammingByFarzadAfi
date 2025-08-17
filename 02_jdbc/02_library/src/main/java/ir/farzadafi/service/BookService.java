package ir.farzadafi.service;

import ir.farzadafi.model.Book;
import ir.farzadafi.repository.BookRepository;

import java.sql.SQLException;

public class BookService {
    private final BookRepository bookRepository = new BookRepository();

    public int save(Book book) throws SQLException {
        boolean result = bookRepository.isExistByTitle(book.getTitle());
        if(result)
            return -1;
        return bookRepository.save(book);
    }
}
