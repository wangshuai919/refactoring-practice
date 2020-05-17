package practice02;

public class Bird {
    public static final int EUROPEAN = 0;
    public static final int AFRICAN = 1;
    public static final int NORWEGIAN_BLUE = 2;
    public static final double NORWEGIAN_FACTOR = 1.3;
    public static final double BASE_SPEED = 60.0;
    private int type;
    private double factor;

    public Bird(int type) {
        this.type = type;
    }

    public double getSpeed() {
        switch (type) {
            case EUROPEAN:
                return getBaseSpeed();
            case AFRICAN:
                return getBaseSpeed() * factor;
            case NORWEGIAN_BLUE:
                return getBaseSpeed() * factor * NORWEGIAN_FACTOR;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    private double getBaseSpeed() {
        return BASE_SPEED;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }
}
