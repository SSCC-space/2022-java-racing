package org.sscc.study;

import org.sscc.study.controller.GameController;
import org.sscc.study.view.InputView;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            InputView inputView = new InputView(new Scanner(System.in));
            GameController gameController = new GameController(inputView);
            gameController.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
