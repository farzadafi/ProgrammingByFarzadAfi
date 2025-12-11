import model.*;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("a", "b", 1000);
        Phone phone = new Phone("q", "z", 200);
        Clothing clothing = new Clothing("j", "g", 100);

        Warehouse<Book> warehouse = new Warehouse<>();
        Box<Book, Integer> bookBox = new Box<>(1, book);
        warehouse.store(bookBox);
        warehouse.printInventory();
        Box<Book, Integer> bookIntegerBox = warehouse.copyBox(bookBox);
        System.out.println(bookIntegerBox.toString());
    }
}
