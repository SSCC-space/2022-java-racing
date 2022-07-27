package org.sscc.study.util;

public enum SystemMessage {
    MESSAGE_SET_CAR_NAMES("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."),
    MESSAGE_ROUND_NUMBER("시도할 회수는 몇회인가요?"),
    MESSAGE_WINNER("이/가 최종 우승했습니다");

    private final String message;

    SystemMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
