package org.sscc.study;

import org.sscc.study.controller.GameController;

public class Application {
    public static void main(String[] args) {
        try {
            GameController gameController = new GameController();
            gameController.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
