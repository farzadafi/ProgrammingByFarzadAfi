package model;

public class Box<T, ID extends Number> {
    private ID id;
    private T item;

    public Box(ID id, T item) {
        this.id = id;
        this.item = item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", item=" + item +
                '}';
    }
}
