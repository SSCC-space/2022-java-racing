package racinggame;

import java.util.ArrayList;

public class Cars {
    private final ArrayList<Car> racingCars;

    public Cars(int carCount) {
        this.racingCars = new ArrayList<>();
        for (int i = 0; i < carCount; i++) {
            this.racingCars.add(new Car());
        }
    }

    public Record makeRecord() {
        ArrayList<Integer> record = new ArrayList<>();
        for (Car car : racingCars) {
            record.add(car.getPosition());
        }
        return new Record(record);
    }

    public void decideMove(MoveCase moveCase) {
        for (Car car : racingCars) {
            if (moveCase.isMovable()) {
                car.move();
            }
        }
    }
}
