package service;

import model.Book;
import repository.BookRepository;

public class BookService {

    private final BookRepository bookRepository = new BookRepository();

    public void addBook(Book book) {
       bookRepository.save(book);
    }
}
