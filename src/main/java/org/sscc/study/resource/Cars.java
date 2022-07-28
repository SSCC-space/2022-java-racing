package org.sscc.study.resource;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final CarList carList;
    private final Round rounds;
    private int maxPosition;
    private static final RandomCondition randomCondition = new RandomCondition();

    public Cars(String input, int roundCount) {
        this.carList = new CarList();
        this.rounds = new Round(roundCount);
        addCar(input);
    }

    private void addCar(String input) {
        for (String carName : input.split(",")) {
            carList.add(carName);
        }
    }

    public void move() {
        for (Car car : carList.getList()) {
            car.move(randomCondition);
        }
    }

    public List<Car> carList() {
        return carList.getList();
    }

    public int roundCount() {
        return rounds.roundCount();
    }

    public List<String> winner() {
        List<String> winner = new ArrayList<>();
        getMaxPosition();
        for (Car car : carList.getList()) {
            if (maxPosition == car.currentPosition()) {
                winner.add(car.name());
            }
        }
        return winner;
    }

    private void getMaxPosition() {
        int max = -1;
        for (Car car : carList.getList()) {
            if (car.currentPosition() > max) {
                max = car.currentPosition();
            }
        }
        maxPosition = max;
    }
}
