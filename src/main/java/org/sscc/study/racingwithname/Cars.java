package org.sscc.study.racingwithname;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Cars {
    private final List<Car> cars;

    public Cars(StringTokenizer st) {
        cars = new ArrayList<>();
        while(st.hasMoreTokens()) {
            cars.add(new Car(st.nextToken()));
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
