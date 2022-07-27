package org.sscc.study.resource;

import org.sscc.study.util.Constants;
import org.sscc.study.util.ErrorMessage;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private final List<Car> carList;

    public CarList() {
        this.carList = new ArrayList<>();
    }

    public void add(String carName) throws IllegalArgumentException {
        validateName(carName);
        carList.add(new Car(carName));
    }

    public List<Car> toList() {
        return carList;
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
        if (carName.length() > Constants.MAX_NAME_SIZE.value()) {
            throw new IllegalArgumentException(ErrorMessage.TOO_LONG_NAME.message());
        }
    }
}
