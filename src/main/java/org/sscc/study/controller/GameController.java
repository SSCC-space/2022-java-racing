package org.sscc.study.controller;

import org.sscc.study.resource.Car;
import org.sscc.study.resource.Cars;
import org.sscc.study.resource.RandomCondition;
import org.sscc.study.view.InputView;
import org.sscc.study.view.ResultView;

import java.util.Scanner;

public class GameController {
    private final Cars cars;
    private final ResultView resultView;
    private final RandomCondition randomCondition;

    public GameController() {
        InputView inputView = new InputView(new Scanner(System.in));
        this.resultView = new ResultView();
        this.randomCondition = new RandomCondition();
        this.cars = new Cars(inputView.contenderNames(), inputView.roundNumber());
    }

    public void play() {
        printResult(cars);
    }

    private void printResult(Cars cars) {
        for (int i = 0; i < cars.roundCount(); i++) {
            printRoundResult(cars);
        }

        printWinner(cars);
    }

    private void printRoundResult(Cars cars) {
        for (Car car : cars.roster()) {
            car.move(randomCondition);
            resultView.printCarName(car.name());
            resultView.printCarPosition(car.currentPosition());
            resultView.lineFeed();
        }
        resultView.lineFeed();
    }

    private void printWinner(Cars cars) {
        resultView.printWinner(cars.winner());
    }
}
