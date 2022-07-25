package org.sscc.study.racing;

import java.util.Scanner;

public class InputView {
    public InputValues getValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int number = sc.nextInt();
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int count = sc.nextInt();
        return new InputValues(number, count);
    }
}