package l_oop.f_exercise;

import l_oop.f_exercise.vehicle.Vehicle;

public class Floor {
    private ParkingSpot[] spots = new ParkingSpot[100];
    int floorNumber;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        if (spots[0] == null) {
            for (int i = 0; i < spots.length; i++) {
                spots[i] = new ParkingSpot(i + 1);
            }
        }
    }

    public int parkVehicle(Vehicle vehicle) {
        for (int i = 0; i < spots.length; i++) {
            if (spots[i].assignVehicle(vehicle)) {
                return spots[i].getSpotNumber();
            }
        }
        return -1;
    }

    public int getAvailableSpoutsCount() {
        int count = 0;
        for (int i = 0; i < spots.length; i++) {
            if (spots[i].isAvailable())
                ++count;
        }
        return count;
    }

    public int getOccupiedSpotsCount() {
        int count = 0;
        for (int i = 0; i < spots.length; i++) {
            if (!spots[i].isAvailable())
                ++count;
        }
        return count;
    }

    public int getCountSpotsByVehicleType(String type) {
        int count = 0;
        for (int i = 0; i < spots.length; i++) {
            if (spots[i].getCurrentVehicle() != null &&
                    spots[i].getCurrentVehicle().getClass().getSimpleName().equals(type))
                ++count;
        }
        return count;
    }

    public Vehicle findVehicleByPlate(String plate) {
        for (int i = 0; i < spots.length; i++) {
            if(spots[i].getCurrentVehicle().getLicensePlate().equals(plate))
                return spots[i].getCurrentVehicle();
        }
        return null;
    }

    public ParkingSpot findParkingSpotByPlate(String plate) {
        for (int i = 0; i < spots.length; i++) {
            if(spots[i].getCurrentVehicle().getLicensePlate().equals(plate))
                return spots[i];
        }
        return null;
    }
}
