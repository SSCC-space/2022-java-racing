package org.sscc.study.resource;

import java.util.List;

public class Cars {
    private final CarList carList;


    public Cars(String input) {
        this.carList = new CarList();
        addCar(input);
    }

    private void addCar(String input) {
        for (String carName : input.split(",")) {
            carList.add(carName);
        }
    }

    public void move(RandomCondition randomCondition) {
        carList.getList().forEach(car -> {
            if (randomCondition.isMovable()) {
                car.move();
            }
        });
    }

    public List<Car> carList() {
        return carList.getList();
    }
}
