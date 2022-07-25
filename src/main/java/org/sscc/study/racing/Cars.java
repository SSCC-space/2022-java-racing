package org.sscc.study.racing;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(int number) {
        cars = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            cars.add(new Car(0));
        }
    }

    public void run(MoveStrategy moveStrategy) {
        for (Car car : cars) {
            moveCar(car, moveStrategy);
        }
    }

    private void moveCar(Car car, MoveStrategy moveStrategy) {
        if (moveStrategy.isMoveAble()) {
            car.move();
        }
    }

    public Record getRecord() {
        return new Record(cars);
    }
}
