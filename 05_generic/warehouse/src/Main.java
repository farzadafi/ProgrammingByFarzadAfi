import model.Book;
import model.Clothing;
import model.Phone;
import model.Warehouse;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("a", "b", 1000);
        Phone phone = new Phone("q", "z", 200);
        Clothing clothing = new Clothing("j", "g", 100);

        Warehouse<Book> warehouse = new Warehouse<>();
        warehouse.store(book);
        warehouse.printInventory();
    }
}
