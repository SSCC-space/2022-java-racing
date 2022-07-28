package org.sscc.study.view;

import org.sscc.study.util.SystemMessage;

import java.util.List;

public class ResultView {
    private static final char POSITION_MARK = '-';

    public void printCarName(String carName) {
        System.out.print(carName + " : ");
    }

    public void printCarPosition(int currentPosition) {
        for (int i = 0; i < currentPosition; i++) {
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
