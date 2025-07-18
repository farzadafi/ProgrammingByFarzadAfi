package k_oop.g_exercise.vehicle;

public class Car extends Vehicle{

    public Car(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("move car");
    }

    public void playMusic() {
        System.out.println("play music car \n");
    }
}
