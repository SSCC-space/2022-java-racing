package org.sscc.study.resource;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private final List<Car> carList;

    public CarList() {
        this.carList = new ArrayList<>();
    }

    public void add(String carName) throws IllegalArgumentException {
        carList.add(new Car(carName));
    }

    public List<Car> toList() {
        return carList;
    }
}
