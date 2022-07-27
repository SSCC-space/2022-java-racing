package org.sscc.study.resource;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final CarList carList;
    private final String input;
    private final Round rounds;
    private int firstRank;

    public Cars(String input, int roundCount) {
        this.carList = new CarList();
        this.input = input;
        this.rounds = new Round(roundCount);
        addCar();
    }

    private void addCar() {
        for (String carName : input.split(",")) {
            carList.add(carName);
        }
    }

    public List<Car> roster() {
        return carList.toList();
    }

    public int roundCount() {
        return rounds.roundCount();
    }

    public List<String> winner() {
        List<String> winner = new ArrayList<>();
        getRank();
        for (Car car : carList.toList()) {
            if (firstRank == car.currentPosition()) {
                winner.add(car.name());
            }
        }
        return winner;
    }

    private void getRank() {
        int first = -1;
        for (Car car : carList.toList()) {
            if (car.currentPosition() > first) {
                first = car.currentPosition();
            }
        }
        firstRank = first;
    }
}
