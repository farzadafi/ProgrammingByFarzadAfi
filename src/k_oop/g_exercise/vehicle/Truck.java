package k_oop.g_exercise.vehicle;

public class Truck extends Vehicle{

    public Truck(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("move truck");
    }

    public void loadCargo() {
        System.out.println("load cargo truck \n");
    }
}
