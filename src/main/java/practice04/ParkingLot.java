package practice04;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private int capacity;
    private Map<Token, Car> tokenCarMap = new HashMap<Token, Car>();

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public Token park(Car car) {
        if(isFull()) throw new FullException();
        Token token = new Token();
        tokenCarMap.put(token, car);
        return token;
    }

    public boolean isFull() {
        return tokenCarMap.size() == capacity;
    }

    public Car pick(Token token) {
        Car car = tokenCarMap.get(token);
        if(car == null) throw new CarNotException();
        tokenCarMap.remove(token);
        return car;
    }

    public int getSpaces() {
        return capacity - tokenCarMap.size();
    }
}
