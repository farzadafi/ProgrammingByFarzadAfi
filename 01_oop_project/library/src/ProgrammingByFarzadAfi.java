import dto.SimpleBook;
import model.Book;
import model.User;
import service.BookService;
import service.LoanService;
import service.UserService;

import java.time.LocalDate;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Book book1 = new Book("a", "aa", 10);
        Book book2 = new Book("b", "bb", 10);
        Book book3 = new Book("c", "aa", 10);
        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);


        bookService.remove("b");

        User user = new User("abc", "abcd",
                "3080000000", LocalDate.now());
        UserService userService = new UserService();
        userService.addUser(user);

        SimpleBook[] allBooks = bookService.getAllBooks();
        for (int i = 0; i < allBooks.length; i++) {
            System.out.println(allBooks[i]);
        }

        System.out.println();
        SimpleBook result = bookService.findByTitle("asdfsdf");
        if (result == null)
            System.out.println("can't find book");
        else
            System.out.println(result);

        System.out.println("*****");
        SimpleBook[] resultBooks = bookService.getBooksByWriterName("bb");
        for (int i = 0; i < resultBooks.length; i++) {
            System.out.println(resultBooks[i]);
        }

        LoanService loanService = new LoanService();
        int i = loanService.loanBook("a", "3080000000");
        if(i == 1)
            System.out.println("more than one year");
        else if(i == 2)
            System.out.println("full");
        else if(i == 3)
            System.out.println("OK");

//        loanService.retrieveBook("3080000000", "a");

        String[] allLoanByNationalCode = loanService.getAllLoanByNationalCode("3080000000");
        for (int q = 0; q < allLoanByNationalCode.length; q++) {
            System.out.println(allLoanByNationalCode[q]);
        }
    }
}
