package org.sscc.study.util;

public enum ErrorMessage {
    NULL_OR_EMPTY_NAME("자동차의 이름을 입력하지 않았습니다"),
    TOO_LONG_NAME("자동차의 이름은 5글자 이하로 제한됩니다"),
    NO_EXECUTABLE_ROUNDS("1회 이상 시도하여야 합니다");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
