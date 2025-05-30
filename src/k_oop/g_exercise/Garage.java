package k_oop.g_exercise;

import k_oop.g_exercise.vehicle.Bicycle;
import k_oop.g_exercise.vehicle.Car;
import k_oop.g_exercise.vehicle.Truck;
import k_oop.g_exercise.vehicle.Vehicle;

public class Garage {
    private final Vehicle[] vehicles = new Vehicle[6];

    public void init() {
        Vehicle v1 = new Bicycle(10);
        Vehicle v2 = new Car(120);
        Vehicle v3 = new Truck(60);

        Vehicle v4 = new Bicycle(12);
        Vehicle v5 = new Car(130);
        Vehicle v6 = new Truck(70);

        vehicles[0] = v1;
        vehicles[1] = v2;
        vehicles[2] = v3;
        vehicles[3] = v4;
        vehicles[4] = v5;
        vehicles[5] = v6;
    }

    public void print() {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("call move method before downcast");
            vehicles[i].move();
            System.out.println();
            if(vehicles[i] instanceof Bicycle b) {
                b.ringBell();
                System.out.println("call move after downcast");
                b.move();
            }
            else if(vehicles[i] instanceof Car c){
                c.playMusic();
                System.out.println("call move after downcast");
                c.move();
            }
            else if(vehicles[i] instanceof Truck t){
                t.loadCargo();
                System.out.println("call move after downcast");
                t.move();
            }
        }
    }
}
