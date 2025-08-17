package ir.farzadafi.model;

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

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public int getQuantity() {
        return quantity;
    }
}