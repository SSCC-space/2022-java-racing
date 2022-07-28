package org.sscc.study.resource;

import org.sscc.study.util.ErrorMessage;

public class Round {
    private final int roundCount;

    public Round(int roundCount) throws IllegalArgumentException {
        validateNumber(roundCount);
        this.roundCount = roundCount;
    }

    private void validateNumber(int roundCount) throws IllegalArgumentException {
        if (roundCount <= 0) {
            throw new IllegalArgumentException(ErrorMessage.NO_EXECUTABLE_ROUNDS.message());
        }
    }

    public int roundCount() {
        return roundCount;
    }
}
