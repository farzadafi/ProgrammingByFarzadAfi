package l_oop.f_exercise.vehicle;

import java.time.LocalDateTime;

public class Car extends Vehicle{

    public Car(LocalDateTime entryTime, String licensePlate) {
        super(entryTime, licensePlate);
    }

    @Override
    public double calculateParkingFee(int duration) {
        return duration * 10_000;
    }
}
