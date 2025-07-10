package model;

public class Book {
    private String title;
    private String writerName;
    private int quantity;

    public Book(String title, String writerName, int quantity) {
        this.title = title;
        this.writerName = writerName;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getWriterName() {
        return writerName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", writerName='" + writerName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
