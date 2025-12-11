package model;

public class Warehouse<T> {

    private Box<T, ?> box;

    public void store(Box<T, ?> box) {
        this.box = box;
    }

    public void printInventory() {
        System.out.println("Warehouse Inventory:");

        if (box != null)
            System.out.println("item=" + box);
        else
            System.out.println("inventory empty");

        System.out.println("==================================");
    }

    public <U, X extends Number> Box<U, X> copyBox(Box<U, X> box) {
        return new Box<>(box.getId(), box.getItem());
    }

    public <A extends Goods, ID extends Number> Box<? extends Goods, ID> transformBox(Box<A, ID> input, ConvertTo convertTo) {
        if (input.getItem() instanceof Book book && convertTo.equals(ConvertTo.PHONE)) {
            Phone phone = new Phone(book.getName(), "test", book.getPrice() - 100);
            return new Box<>(input.getId(), phone);

        } else if (input.getItem() instanceof Book book && convertTo.equals(ConvertTo.CLOTHING)) {
            Clothing clothing = new Clothing(book.getName(), "Red", book.getPrice() - 200);
            return new Box<>(input.getId(), clothing);
        }

        if(input.getItem() instanceof Phone phone && convertTo.equals(ConvertTo.BOOK)) {
            Book book = new Book(phone.getName(), "test", phone.getPrice() + 100);
            return new Box<>(input.getId(), book);
        }
        else if(input.getItem() instanceof Phone phone && convertTo.equals(ConvertTo.CLOTHING)) {
            Clothing clothing = new Clothing(phone.getName(), "Red", phone.getPrice() - 200);
            return new Box<>(input.getId(), clothing);
        }

        return null;
    }
}
