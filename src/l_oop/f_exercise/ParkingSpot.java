package l_oop.f_exercise;

import l_oop.f_exercise.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ParkingSpot {
    private int spotNumber;
    private Vehicle currentVehicle;
    private boolean isAvailable;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.isAvailable = true;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }

    public int getParkedDuration() {
        LocalDateTime entryTime = currentVehicle.getEntryTime();
        LocalDateTime nowTime = LocalDateTime.now().plusDays(1);
        long hours = ChronoUnit.HOURS.between(entryTime, nowTime);
        return (int) hours;
    }

    public void releaseStop() {
        currentVehicle = null;
        isAvailable = true;
    }

    public boolean assignVehicle(Vehicle vehicle) {
        if(!isAvailable)
            return false;
        currentVehicle = vehicle;
        isAvailable = false;
        return true;
    }
}
