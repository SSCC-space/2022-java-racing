package org.sscc.study.racingwithname;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Cars {
    private final List<Car> cars;

    public Cars(StringTokenizer st) {
        cars = new ArrayList<>();
        while(st.hasMoreTokens()) {
            String name = checkLength(st.nextToken());
            cars.add(new Car(name));
        }
    }

    private String checkLength(String name){
        if(name.length()>5){
            throw new IllegalArgumentException("자동차 이름은 5자를 넘을 수 없습니다.");
        }
        return name;
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
