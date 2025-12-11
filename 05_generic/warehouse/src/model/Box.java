package model;

public class Box<T, ID extends Number> {
    private ID id;
    private T item;

    public Box(ID id, T item) {
        this.id = id;
        this.item = item;
    }

    public ID getId() {
        return id;
    }

    public T getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", item=" + item +
                '}';
    }
}
