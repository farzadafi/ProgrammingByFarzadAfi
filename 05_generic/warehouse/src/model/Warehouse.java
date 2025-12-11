package model;

public class Warehouse {

    private Box<Book> bookBox;
    private Box<Phone> phoneBox;
    private Box<Clothing> clothingBox;

    public void storeBook(Book book) {
        this.bookBox = new Box<>(book);
    }

    public void storePhone(Phone phone) {
        this.phoneBox = new Box<>(phone);
    }

    public void storeClothing(Clothing clothing) {
        this.clothingBox = new Box<>(clothing);
    }

    public void printInventory() {
        System.out.println("Warehouse Inventory:");

        if (bookBox != null)
            System.out.println("book=" + bookBox);
        else
            System.out.println("book is empty");

        if (phoneBox != null)
            System.out.println("phone=" + phoneBox);
        else
            System.out.println("phone is empty");

        if (clothingBox != null)
            System.out.println("clothing=" + clothingBox);
        else
            System.out.println("clothing is empty");

        System.out.println("==================================");
    }
}
