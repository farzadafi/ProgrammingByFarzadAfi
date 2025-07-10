package service;

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
}
