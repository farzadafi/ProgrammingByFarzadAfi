package repository;

import model.Book;

public class BookRepository {

    private static final Book[] BOOKS = new Book[100];

    public void save(Book book) {
        for (int i = 0; i < BOOKS.length; i++) {
            if (BOOKS[i] == null)
                BOOKS[i] = book;
        }
    }
}
