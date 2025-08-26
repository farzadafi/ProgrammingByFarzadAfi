package ir.farzadafi;

import ir.farzadafi.dto.BookWithBooleanQuantity;
import ir.farzadafi.model.Book;
import ir.farzadafi.model.BookLoan;
import ir.farzadafi.model.User;
import ir.farzadafi.repository.BookRepository;
import ir.farzadafi.repository.UserRepository;
import ir.farzadafi.service.BookLoanService;
import ir.farzadafi.service.BookService;
import ir.farzadafi.service.UserService;
import ir.farzadafi.utility.DynamicArray;
import ir.farzadafi.utility.JdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) throws SQLException {
        BookService bookService = new BookService();
        UserService userService = new UserService();
        BookLoanService bookLoanService = new BookLoanService();
        UserRepository userRepository = new UserRepository();
        System.out.println(userRepository.isExistsNationalCode("3080000001"));
//        insert book
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
        User user = new User("aaa", "3080000001");
        System.out.println(userService.save(user));

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
//        DynamicArray dynamicArray = bookService.listUnReturnedBook();
//        for (int i = 0; i < dynamicArray.getSize(); i++) {
//            System.out.println(dynamicArray.getByIndex(i));
//        }

        //list of unReturned book by user national code step 11
//        DynamicArray dynamicArray = bookLoanService.listUnReturnedBookByUserNationalCode("3080000000");
//        for (int i = 0; i < dynamicArray.getSize(); i++) {
//            System.out.println(dynamicArray.getByIndex(i));
//        }

//        remove book ste1p 12
//        int remove = bookService.remove(2);
//        if(remove == -1)
//            System.out.println("this book has active loan");
//        else
//            System.out.println("OK!");

//        testPreparedStatementLeak();
    }

    public void testConnectionLeak() throws SQLException {
        Connection[] connection = new Connection[2_000];
        for (int i = 0; i < 2_000; i++) {
            Connection connection1 = JdbcConnection.getConnection();
            connection[i] = connection1;
        }
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter for close connection:");
        scanner.nextLine();
//
        for (int i = 0; i < 2_000; i++) {
            connection[i].close();
        }

        System.out.println("Please enter for null all object:");
        scanner.nextLine();

        for (int i = 0; i < 2_000; i++) {
            connection[i] = null;
        }

        System.out.println("Please enter for down app:");
        scanner.nextLine();
    }

    public static void testPreparedStatementLeak() throws SQLException {
        PreparedStatement[] connection = new PreparedStatement[50_000];
        Connection connection1 = JdbcConnection.getConnection();
        for (int i = 0; i < 50_000; i++) {
            connection[i] = connection1.prepareStatement("tesdt");
        }
        Scanner scanner =new Scanner(System.in);
//        System.out.println("Please enter for close connection:");
//        scanner.nextLine();
//
//        for (int i = 0; i < 50_000; i++) {
//            connection[i].close();
//        }

        System.out.println("Please enter for null all object:");
        scanner.nextLine();

        for (int i = 0; i < 50_000; i++) {
            connection[i] = null;
        }

        System.out.println("Please enter for down app:");
        scanner.nextLine();
    }
}