package model;

public class Warehouse<T> {

    private Box<T> box;

    public void store(T item) {
        this.box = new Box<>(item);
    }

    public void printInventory() {
        System.out.println("Warehouse Inventory:");

        if (box != null)
            System.out.println("item=" + box);
        else
            System.out.println("inventory empty");

        System.out.println("==================================");
    }
}
