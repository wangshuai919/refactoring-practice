package practice04;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParkingLotTest {
    @Test
    public void should_return_token_when_park_given_car_parkingLot() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car("1111-1110-01");
        Token token = parkingLot.park(car);
        assertTrue(token != null);
    }

    @Test(expected = FullException.class)
    public void should_return_exception_when_park_given_parklingLot_is_full() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car("1111-1110-01");
        parkingLot.park(car);

        parkingLot.park(new Car("1111-002-002"));
    }


    @Test
    public void should_return_car_when_pick_given_a_valid_token() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car("1111-1110-01");
        Token token = parkingLot.park(car);
        assertTrue(car == parkingLot.pick(token));
    }

    @Test
    public void should_return_token_when_park_given_pick_a_car_from_parkingLot() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car("1111-1110-01");
        parkingLot.pick(parkingLot.park(car));

        Token token = parkingLot.park(new Car("111-000-003"));
        assertTrue(token != null);
    }

    @Test(expected = CarNotException.class)
    public void should_return_exception_when_pick_given_a_used_token() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car("1111-1110-01");
        Token token = parkingLot.park(car);

        parkingLot.pick(token);
        parkingLot.pick(token);
    }

    @Test(expected = CarNotException.class)
    public void should_return_exception_when_pick_given_a_not_valid_token() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park(new Car("1111-1110-01"));

        parkingLot.pick(new Token());
    }
}
