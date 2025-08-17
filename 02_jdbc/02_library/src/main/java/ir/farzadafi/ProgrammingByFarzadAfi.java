package ir.farzadafi;

import ir.farzadafi.dto.BookWithBooleanQuantity;
import ir.farzadafi.model.Book;
import ir.farzadafi.service.BookService;

import java.sql.SQLException;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) throws SQLException {
        BookService bookService = new BookService();
        //insert book
//        Book book = new Book("ab", "b", 1400, 0);
//        System.out.println(bookService.save(book));

        //update book quantity
//        System.out.println(bookService.updateQuantity("a", 3));

        //find book by title
//        System.out.println(bookService.findBookByTitle("c"));

        //find all book by author name
        BookWithBooleanQuantity[] bs = bookService.findAllBookByAuthorName("b");
        for (int i = 0; i < bs.length; i++) {
            System.out.println(bs[i]);
        }
    }
}