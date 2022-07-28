package org.sscc.study.resource;

import org.sscc.study.util.ErrorMessage;

public class Car {
    private final static int MAX_NAME_SIZE = 5;
    private final String name;
    private int position = 0;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    public void move(RandomCondition randomCondition) {
        if (randomCondition.isMovable()) {
            position++;
        }
    }

    public int currentPosition() {
        return position;
    }

    public String name() {
        return name;
    }

    private void validateName(String carName) throws IllegalArgumentException {
        checkNullOrEmptyOrBlank(carName);
        checkSize(carName);
    }

    private void checkNullOrEmptyOrBlank(String carName) throws IllegalArgumentException {
        if (carName == null) {
            throw new IllegalArgumentException(ErrorMessage.NULL_OR_EMPTY_NAME.message());
        }
        if (carName.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.NULL_OR_EMPTY_NAME.message());
        }
        if (carName.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.NULL_OR_EMPTY_NAME.message());
        }
    }

    private void checkSize(String carName) throws IllegalArgumentException {
        if (carName.length() > MAX_NAME_SIZE) {
            throw new IllegalArgumentException(ErrorMessage.TOO_LONG_NAME.message());
        }
    }
}
