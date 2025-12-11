package model;

public class Clothing {
    private String name;
    private String color;
    private int price;

    public Clothing(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
