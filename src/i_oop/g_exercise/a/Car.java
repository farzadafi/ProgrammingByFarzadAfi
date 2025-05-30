package i_oop.g_exercise.a;

public class Car {
    String brand;
    String color;
    int year;

    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("brand is: " + this.brand
                + "\n and color is: " + this.color
                + "\n and year is: " + this.year);
    }
}
