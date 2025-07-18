package l_oop.f_exercise.vehicle;

import java.time.LocalDateTime;

public class Truck extends Vehicle{

    public Truck(LocalDateTime entryTime, String licensePlate) {
        super(entryTime, licensePlate);
    }

    @Override
    public double calculateParkingFee(int duration) {
        return duration * 20_000;
    }
}
