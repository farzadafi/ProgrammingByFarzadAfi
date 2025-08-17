package ir.farzadafi.service;

import ir.farzadafi.dto.BookWithBooleanQuantity;
import ir.farzadafi.model.Book;
import ir.farzadafi.repository.BookRepository;

import java.sql.SQLException;

public class BookService {
    private final BookRepository bookRepository = new BookRepository();

    public int save(Book book) throws SQLException {
        boolean result = bookRepository.isExistByTitle(book.getTitle());
        if (result)
            return -1;
        return bookRepository.save(book);
    }

    public int updateQuantity(String name, int newQuantity) throws SQLException {
        boolean result = bookRepository.isExistByTitle(name);
        if (!result)
            return -1;
        return bookRepository.updateQuantity(name, newQuantity);
    }

    public BookWithBooleanQuantity findBookByTitle(String title) throws SQLException {
        Book book = bookRepository.findByTitle(title);
        if(book == null)
            return null;
        boolean hasQuantity = false;
        if (book.getQuantity() > 0)
            hasQuantity = true;
        return new BookWithBooleanQuantity(book.getId(),
                book.getTitle(),
                book.getAuthorName(),
                book.getPublishYear(),
                hasQuantity);
    }
}
