package ir.farzadafi;

import ir.farzadafi.dto.BookWithBooleanQuantity;
import ir.farzadafi.model.Book;
import ir.farzadafi.model.User;
import ir.farzadafi.service.BookService;
import ir.farzadafi.service.UserService;

import java.sql.SQLException;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) throws SQLException {
        BookService bookService = new BookService();
        UserService userService = new UserService();
        //insert book
//        Book book = new Book("ab", "b", 1400, 0);
//        System.out.println(bookService.save(book));

        //update book quantity
//        System.out.println(bookService.updateQuantity("a", 3));

        //find book by title
//        System.out.println(bookService.findBookByTitle("c"));

        //find all book by author name
//        BookWithBooleanQuantity[] bs = bookService.findAllBookByAuthorName("b");
//        for (int i = 0; i < bs.length; i++) {
//            System.out.println(bs[i]);
//        }

        //save user
        User user = new User("aaa", "3080000000");
        System.out.println(userService.save(user));
    }
}