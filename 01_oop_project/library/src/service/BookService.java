package service;

import dto.SimpleBook;
import model.Book;
import repository.BookRepository;

public class BookService {

    private final BookRepository bookRepository = new BookRepository();
    private final LoanService loanService = new LoanService();

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public boolean remove(String title) {
        Book book = bookRepository.findByTitle(title);
        if (book == null)
            return false;
        boolean isLoan = loanService.isLoan(title);
        if(isLoan)
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

    public Book findByTitleWithQuantity(String title) {
        return bookRepository.findByTitle(title);
    }


    public SimpleBook[] getBooksByWriterName(String writerName) {
        Book[] booksByWriterName = bookRepository.findBooksByWriterName(writerName);
        SimpleBook[] simpleBooks = new SimpleBook[booksByWriterName.length];
        for (int i = 0; i < booksByWriterName.length; i++) {
            Book book = booksByWriterName[i];
            simpleBooks[i] = new SimpleBook(book.getTitle(), book.getWriterName());
        }
        return simpleBooks;
    }
}
