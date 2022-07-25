package org.sscc.study;

import org.sscc.study.view.InputView;
import org.sscc.study.view.ResultView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            InputView inputView = new InputView(new Scanner(System.in));

            RacingGame racingGame = new RacingGame(inputView.carCount(), inputView.roundCount());

            ResultView resultView = new ResultView(racingGame.gameResult());
            resultView.printResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
