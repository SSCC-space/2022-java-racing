package org.sscc.study.view;

import org.sscc.study.util.SystemMessage;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String contenderNames() {
        System.out.println(SystemMessage.MESSAGE_SET_CAR_NAMES.message());
        return scanner.nextLine();
    }

    public int roundNumber() {
        System.out.println(SystemMessage.MESSAGE_ROUND_NUMBER.message());
        return scanner.nextInt();
    }
}
