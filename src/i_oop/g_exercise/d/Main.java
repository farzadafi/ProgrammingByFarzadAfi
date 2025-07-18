package i_oop.g_exercise.d;

import java.util.concurrent.RecursiveAction;

public class Main {
    Rectangle rectangle = new Rectangle(10, 10);
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
