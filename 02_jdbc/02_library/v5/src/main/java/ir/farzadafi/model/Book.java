package ir.farzadafi.model;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int id;
    private String title;
    private String authorName;
    private int publishYear;
    private int quantity;

    public Book(String title, String authorName, int publishYear, int quantity) {
        this.title = title;
        this.authorName = authorName;
        this.publishYear = publishYear;
        this.quantity = quantity;
    }
}