package ir.farzadafi;

import ir.farzadafi.dto.BookWithBooleanQuantity;
import ir.farzadafi.model.Book;
import ir.farzadafi.model.BookLoan;
import ir.farzadafi.model.User;
import ir.farzadafi.service.BookLoanService;
import ir.farzadafi.service.BookService;
import ir.farzadafi.service.UserService;
import ir.farzadafi.utility.DynamicArray;

import java.sql.SQLException;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) throws SQLException {
        BookService bookService = new BookService();
        UserService userService = new UserService();
        BookLoanService bookLoanService = new BookLoanService();
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
//        User user = new User("aaa", "3080000000");
//        System.out.println(userService.save(user));

        // loan book step 8
//        int i = bookLoanService.loanBook("3080000000", "a");
//        if(i == -1)
//            System.out.println("user not found!");
//        else if(i == -2)
//            System.out.println("book not found");
//        else if(i == -3)
//            System.out.println("book not enough");
//        else
//            System.out.println("OK!");
//         return book step 9
//        System.out.println(bookLoanService.returnBook("3080000000", "a"));

        //list of unReturned book step 10
        DynamicArray dynamicArray = bookService.listUnReturnedBook();
        for (int i = 0; i < dynamicArray.getSize(); i++) {
            System.out.println(dynamicArray.getByIndex(i));
        }
    }
}