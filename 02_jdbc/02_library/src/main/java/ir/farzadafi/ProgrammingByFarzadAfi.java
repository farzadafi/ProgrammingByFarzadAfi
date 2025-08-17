package ir.farzadafi;

import ir.farzadafi.model.Book;
import ir.farzadafi.service.BookService;

import java.sql.SQLException;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) throws SQLException {
        BookService bookService = new BookService();
        //insert book
//        Book book = new Book("a", "b", 1400, 2);
//        System.out.println(bookService.save(book));

        //update book quantity
//        System.out.println(bookService.updateQuantity("a", 3));

        //find book by title
        System.out.println(bookService.findBookByTitle("c"));
    }
}