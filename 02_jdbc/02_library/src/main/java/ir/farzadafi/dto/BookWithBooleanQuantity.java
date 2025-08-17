package ir.farzadafi.dto;

import ir.farzadafi.model.Book;

public record BookWithBooleanQuantity(int id,
                                      String title,
                                      String authorName,
                                      int publishYear,
                                      boolean hasQuantity) {
    public BookWithBooleanQuantity(Book book) {
        this(book.getId(),
                book.getTitle(),
                book.getAuthorName(),
                book.getPublishYear(),
                book.getQuantity() > 0);
    }
}
