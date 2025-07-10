import model.Book;
import model.User;
import service.BookService;
import service.UserService;

import java.time.LocalDate;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Book book1 = new Book("a", "aa", 10);
        Book book2 = new Book("b", "bb", 10);
        Book book3 = new Book("c", "cc", 10);
        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);


        bookService.remove("b");

        User user = new User("abc", "abcd",
                "3080000000", LocalDate.now());
        UserService userService = new UserService();
        userService.addUser(user);
    }
}
