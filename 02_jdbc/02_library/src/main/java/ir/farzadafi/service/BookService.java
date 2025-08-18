package ir.farzadafi.service;

import ir.farzadafi.dto.BookWithBooleanQuantity;
import ir.farzadafi.model.Book;
import ir.farzadafi.repository.BookRepository;
import ir.farzadafi.utility.DynamicArray;

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
        if (book == null)
            return null;
        return convertBookToBookWithBooleanQuantity(book);
    }

    private BookWithBooleanQuantity convertBookToBookWithBooleanQuantity(Book book) {
        boolean hasQuantity = book.getQuantity() > 0;
        return new BookWithBooleanQuantity(book.getId(),
                book.getTitle(),
                book.getAuthorName(),
                book.getPublishYear(),
                hasQuantity);
    }

    public BookWithBooleanQuantity[] findAllBookByAuthorName(String authorName) throws SQLException {
        DynamicArray bookArray = bookRepository.findAllByAuthorName(authorName);
        return convertBooksToBookWithBooleanQuantity(bookArray);
    }

    private BookWithBooleanQuantity[] convertBooksToBookWithBooleanQuantity(
            DynamicArray bookArray) {
        BookWithBooleanQuantity[] bookWithBooleanQuantities =
                new BookWithBooleanQuantity[bookArray.getSize()];
        for (int i = 0; i < bookArray.getSize(); i++) {
            Book book = (Book) bookArray.getByIndex(i);
            boolean hasQuantity = false;
            bookWithBooleanQuantities[i] = convertBookToBookWithBooleanQuantity(book);
        }
        return bookWithBooleanQuantities;
    }

    public int minesOneFromBookQuantity(String title) throws SQLException {
        return bookRepository.minesOneFromQuantity(title);
    }

    public int plusOneFromBookQuantity(String title) throws SQLException {
        return bookRepository.plusOneFromQuantity(title);
    }
}
