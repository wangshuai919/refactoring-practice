package practice04;

import java.util.List;

public class ParkingBoy {
    private List<ParkingLot> parkingLots;

    public ParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public Token park(final Car car) {
//        ParkingAble parkingAble = new OrderParkingAble(parkingLots);
//        ParkingAble parkingAble = new RateParkingAble(parkingLots);
        ParkingAble parkingAble = new SpacesParkingAble(parkingLots);
        return parkingAble.park(car);
    }

    public Car pick(Token token) {
        for (ParkingLot parkingLot : parkingLots) {
            Car car = parkingLot.pick(token);
            if (car != null) return car;
        }
        throw new CarNotException();
    }
}
