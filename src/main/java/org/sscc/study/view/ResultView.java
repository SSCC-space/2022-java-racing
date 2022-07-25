package org.sscc.study.view;

import org.sscc.study.resource.Car;
import org.sscc.study.resource.Roster;

import java.util.List;
import java.util.Vector;
import java.util.stream.IntStream;

public class ResultView {
    private final List<Roster> gameResult;

    public ResultView(List<Roster> gameResult) {
        this.gameResult = gameResult;
    }

    public void printResult() {
        System.out.println("\n실행결과");
        for (Roster status : gameResult) {
            printDashedRoster(status);
            System.out.println();
        }
    }

    private void printDashedRoster(Roster status) {
        for (Car car : status.roster()) {
            printDashedPosition(car);
        }
    }

    private void printDashedPosition(Car car) {
        String carPosition = dashPosition(car);
        System.out.println(carPosition);
    }

    private String dashPosition(Car car) {
        StringBuffer positionBar = new StringBuffer();
        IntStream.range(0, car.currentPosition()).forEach(move -> positionBar.append("-"));

        return positionBar.toString();
    }
}
