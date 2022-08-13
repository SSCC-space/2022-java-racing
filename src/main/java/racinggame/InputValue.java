package racinggame;

public class InputValue {
    private final int carCount;
    private final int racingCount;

    public InputValue(int carCount, int racingCount) {
        this.carCount = carCount;
        this.racingCount = racingCount;
    }

    public int getRacingCount() {
        return racingCount;
    }

    public int getCarCount() {
        return carCount;
    }
}
