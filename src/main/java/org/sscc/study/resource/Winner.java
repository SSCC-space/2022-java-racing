package org.sscc.study.resource;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    private final List<String> winner;
    private final Cars cars;
    private int maxPosition;

    public Winner(Cars cars) {
        this.cars = cars;
        this.winner = new ArrayList<>();
        getMaxPosition();
    }

    public List<String> getWinnersList() {
        cars.carList().forEach(car -> {
            if (car.currentPosition() == maxPosition) {
                winner.add(car.name());
            }
        });
        return winner;
    }

    private void getMaxPosition() {
        for (Car car : cars.carList()) {
            comparePosition(car, maxPosition);
        }
    }

    private void comparePosition(Car car, int maxPosition) {
        if (car.currentPosition() > maxPosition) {
            this.maxPosition = car.currentPosition();
        }
    }
}
