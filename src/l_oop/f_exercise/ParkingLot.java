package l_oop.f_exercise;

public class ParkingLot {
    Floor[] floors = new Floor[5];

    public void addFloor(Floor floor) {
        int i;
        for (i = 0; i < floors.length; i++) {
            if(floors[i] == null)
                break;
        }
        floors[i] = floor;
    }
}
