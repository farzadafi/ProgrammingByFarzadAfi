package k_oop.g_exercise.vehicle;

public class Bicycle extends Vehicle{

    public Bicycle(int speed) {
        super(speed);
    }

    @Override
    public void move(){
        System.out.println("move bicycle");
    }

    public void ringBell() {
        System.out.println("ring bicycle \n");
    }
}
