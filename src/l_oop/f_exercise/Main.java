package l_oop.f_exercise;

import l_oop.f_exercise.vehicle.Car;
import l_oop.f_exercise.vehicle.Vehicle;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Floor floor = new Floor(1);
        parkingLot.addFloor(floor);

        Vehicle car = new Car(LocalDateTime.now(), "123");
        int result = floor.parkVehicle(car);
        System.out.println("car parked in spot number: " + result);

        System.out.println("available spot: " + floor.getAvailableSpoutsCount());
        System.out.println("occupied spot: " + floor.getOccupiedSpotsCount());
        System.out.println("cat sports: " + floor.getCountSpotsByVehicleType("Car"));
        System.out.println("vehicle by plate 123: " + floor.findVehicleByPlate("123"));

        ParkingSpot parkingSpot = floor.findParkingSpotByPlate("123");
        int duration = parkingSpot.getParkedDuration();
        System.out.println("duration is: " + duration);
        double fee = car.calculateParkingFee(duration);
        System.out.println(fee);
    }
}
