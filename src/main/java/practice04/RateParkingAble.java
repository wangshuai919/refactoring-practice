package practice04;

import java.util.List;

public class RateParkingAble implements ParkingAble {
    private List<ParkingLot> parkingLots;

    public RateParkingAble(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    @Override
    public Token park(Car car) {
        return null;
    }
}
