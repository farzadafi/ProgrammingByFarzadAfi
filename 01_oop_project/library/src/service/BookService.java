package service;

import dto.SimpleBook;
import model.Book;
import repository.BookRepository;

public class BookService {

    private final BookRepository bookRepository = new BookRepository();

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public boolean remove(String title) {
        Book book = bookRepository.findByTitle(title);
        if (book == null)
            return false;
        bookRepository.removeByTitle(title);
        return true;
    }

    public SimpleBook[] getAllBooks() {
        int numberOfBook = bookRepository.getNumberOfBook();
        Book[] books = bookRepository.getBooks(numberOfBook);
        SimpleBook[] simpleBooks = new SimpleBook[numberOfBook];
        for (int i = 0; i < numberOfBook; i++) {
            Book book = books[i];
            SimpleBook sb = new SimpleBook(book.getTitle(), book.getWriterName());
            simpleBooks[i] = sb;
        }
        return simpleBooks;
    }

    public SimpleBook findByTitle(String title) {
        Book byTitle = bookRepository.findByTitle(title);
        if (byTitle == null)
            return null;
        return new SimpleBook(byTitle.getTitle(), byTitle.getWriterName());
    }
}
