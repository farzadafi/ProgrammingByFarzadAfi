package ir.farzadafi.model;

public class Book {
    private int id;
    private String title;
    private String authorName;
    private int publishYear;
    private int quantity;

    public Book() {

    }

    public Book(String title, String authorName, int publishYear, int quantity) {
        this.title = title;
        this.authorName = authorName;
        this.publishYear = publishYear;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}