package ir.farzadafi;

import ir.farzadafi.model.Book;
import java.sql.SQLException;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) throws SQLException {
        Book book = new Book("book A", "b", 1390, 10);
        book.setTitle("Book B");
        System.out.println(book.getTitle());
        System.out.println(book.getAuthorName());
        System.out.println(book);

        Book book1 = new Book("book A", "b", 1390, 10);
        Book book2 = new Book("book A", "b", 1390, 10);
        System.out.println(book1.equals(book2));
    }
}