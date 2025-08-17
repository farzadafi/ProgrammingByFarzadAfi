package ir.farzadafi;

import ir.farzadafi.model.Book;
import ir.farzadafi.service.BookService;

import java.sql.SQLException;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) throws SQLException {
        //insert book
        BookService bookService = new BookService();
        Book book = new Book("a", "b", 1400, 2);
        System.out.println(bookService.save(book));
    }
}