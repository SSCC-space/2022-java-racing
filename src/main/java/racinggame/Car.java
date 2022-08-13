package racinggame;

public class Car {
    private final int INITIAL_POSITION_OF_CAR = 1;
    private int position;

    public Car() {
        this.position = INITIAL_POSITION_OF_CAR;
    }

    public void move() {
        position++;
    }

    public int getPosition() {
        return position;
    }
}
