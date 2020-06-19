package practice04;

import java.util.List;

public class SpacesParkingAble implements ParkingAble {
    private List<ParkingLot> parkingLots;

    public SpacesParkingAble(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    @Override
    public Token park(Car car) {
        ParkingLot spacesParkingLot = new ParkingLot(0);
        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLot.getSpaces() > spacesParkingLot.getSpaces()) {
                spacesParkingLot = parkingLot;
            }
        }
        return spacesParkingLot.park(car);
    }
}
