package org.sscc.study.racingwithname;

import java.util.Scanner;

public class InputView {
    public InputValues getValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String names = sc.nextLine();
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int count = sc.nextInt();
        return new InputValues(names, count);
    }
}