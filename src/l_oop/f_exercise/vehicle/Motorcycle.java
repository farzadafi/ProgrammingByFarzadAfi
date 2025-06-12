package l_oop.f_exercise.vehicle;

import java.time.LocalDateTime;

public class Motorcycle extends Vehicle{

    public Motorcycle(LocalDateTime entryTime, String licensePlate) {
        super(entryTime, licensePlate);
    }

    @Override
    public double calculateParkingFee(int duration) {
        return duration * 5_000;
    }
}
