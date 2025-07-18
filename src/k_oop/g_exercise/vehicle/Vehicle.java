package k_oop.g_exercise.vehicle;

import java.util.PrimitiveIterator;

public class Vehicle {
    private int speed;

    public void move() {
        System.out.println("move vehicle");
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }
}
