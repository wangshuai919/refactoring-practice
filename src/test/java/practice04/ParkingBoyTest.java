package practice04;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertSame;

public class ParkingBoyTest {
    @Test
    public void should_pick_car_when_park_car_given_two_parkingLot() {
        ParkingBoy parkingBoy = new ParkingBoy(Arrays.asList(new ParkingLot(1), new ParkingLot(1)));
        Car car = new Car("1000-22-01");
        Token token = parkingBoy.park(car);
        assertSame(car, parkingBoy.pick(token));
    }

    @Test
    public void should_pick_car_from_first_parkingLot_when_pick_given_first_has_capacity() {
        ParkingLot firstParkingLot = new ParkingLot(1);
        ParkingBoy parkingBoy = new ParkingBoy(Arrays.asList(firstParkingLot, new ParkingLot(1)));
        Car car = new Car("1000-22-01");
        Token token = parkingBoy.park(car);
        assertSame(car, firstParkingLot.pick(token));
    }


    @Test
    public void should_pick_car_from_second_parkingLot_when_pick_given_first_full() {
        ParkingLot firstParkingLot = new ParkingLot(1);
        ParkingLot secondParkingLot = new ParkingLot(1);
        ParkingBoy parkingBoy = new ParkingBoy(Arrays.asList(firstParkingLot, secondParkingLot));
        parkingBoy.park(new Car("1000-22-01"));
        Car car = new Car("1000-22-02");
        Token token = parkingBoy.park(car);
        assertSame(car, secondParkingLot.pick(token));
    }

    @Test
    public void should_pick_car_from_second_parkingLot_when_pick_given_more_spaces_in_second_parkingLot() {
        ParkingLot firstParkingLot = new ParkingLot(1);
        ParkingLot secondParkingLot = new ParkingLot(3);
        ParkingBoy parkingBoy = new ParkingBoy(Arrays.asList(firstParkingLot, secondParkingLot));
        Car car = new Car("1000-22-02");
        Token token = parkingBoy.park(car);
        assertSame(car, secondParkingLot.pick(token));
    }

    @Test(expected = FullException.class)
    public void should_return_exception_when_park_given_all_full() {
        ParkingLot firstParkingLot = new ParkingLot(1);
        ParkingLot secondParkingLot = new ParkingLot(1);
        ParkingBoy parkingBoy = new ParkingBoy(Arrays.asList(firstParkingLot, secondParkingLot));
        parkingBoy.park(new Car("1000-22-01"));
        parkingBoy.park(new Car("1000-22-02"));
        parkingBoy.park(new Car("1000-22-03"));
    }

    @Test(expected = CarNotException.class)
    public void should_return_exception_when_pick_given_used_token() {
        ParkingLot firstParkingLot = new ParkingLot(1);
        ParkingLot secondParkingLot = new ParkingLot(1);
        ParkingBoy parkingBoy = new ParkingBoy(Arrays.asList(firstParkingLot, secondParkingLot));
        Token token = parkingBoy.park(new Car("1000-22-01"));
        parkingBoy.pick(token);
        parkingBoy.pick(token);
    }

}
