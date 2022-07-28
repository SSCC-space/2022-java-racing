package org.sscc.study.view;

import org.sscc.study.resource.Car;
import org.sscc.study.resource.Cars;
import org.sscc.study.util.SystemMessage;

import java.util.List;

public class ResultView {
    private static final char POSITION_MARK = '-';

    public void printRoundResult(Cars cars) {
        cars.carList().forEach(car -> {
            System.out.print(car.name() + " : ");
            printPosition(car);
            System.out.println();
        });
    }

    private void printPosition(Car car) {
        for (int i = 0; i < car.currentPosition(); i++) {
            System.out.print(POSITION_MARK);
        }
    }

    public void lineFeed() {
        System.out.println();
    }

    public void printWinner(List<String> winner) {
        System.out.print(String.join(",", winner));
        System.out.println(SystemMessage.MESSAGE_WINNER.message());
    }
}
