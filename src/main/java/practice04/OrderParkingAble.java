package practice04;

import java.util.List;

public class OrderParkingAble implements ParkingAble {
    private List<ParkingLot> parkingLots;

    public OrderParkingAble(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    @Override
    public Token park(Car car) {
        for (ParkingLot parkingLot : parkingLots) {
            if (!parkingLot.isFull()) {
                return parkingLot.park(car);
            }
        }
        throw new FullException();
    }
}
