import model.Book;
import service.BookService;

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
    }
}
