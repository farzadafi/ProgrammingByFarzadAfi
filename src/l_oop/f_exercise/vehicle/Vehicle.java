package l_oop.f_exercise.vehicle;

import java.time.LocalDateTime;

public abstract class Vehicle {
    private LocalDateTime entryTime;
    private String licensePlate;

    public Vehicle(LocalDateTime entryTime, String licensePlate) {
        this.entryTime = entryTime;
        this.licensePlate = licensePlate;
    }

    public abstract double calculateParkingFee(int duration);

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
