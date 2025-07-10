package repository;

import model.Book;

public class BookRepository {

    private static final Book[] BOOKS = new Book[100];

    public void save(Book book) {
        for (int i = 0; i < BOOKS.length; i++) {
            if (BOOKS[i] == null) {
                BOOKS[i] = book;
                break;
            }
        }
    }

    public Book findByTitle(String title) {
        for (int i = 0; i < BOOKS.length; i++) {
            if(BOOKS[i] != null && BOOKS[i].getTitle().equals(title))
                return BOOKS[i];
        }
        return null;
    }

    public void removeByTitle(String title) {
        int i;
        for (i = 0; i < BOOKS.length; i++) {
            if(BOOKS[i].getTitle().equals(title))
                break;
        }
        BOOKS[i] = null;
        for (int j = i; j < BOOKS.length; j++) {
            if(BOOKS[i + 1] != null) {
                BOOKS[i] = BOOKS[i + 1];
                BOOKS[i + 1] =  null;
            }
        }
    }

    public Book[] getBooks(int number) {
        Book[] books = new Book[number];
        for (int i = 0; i < number; i++) {
            books[i] = BOOKS[i];
        }
        return books;
    }

    public int getNumberOfBook() {
        int counter = 0;
        for (int i = 0; i < BOOKS.length; i++) {
            if(BOOKS[i] != null)
                ++counter;
            else
                break;
        }
        return counter;
    }
}
