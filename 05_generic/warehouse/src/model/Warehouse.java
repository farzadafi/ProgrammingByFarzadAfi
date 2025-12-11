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
}
