package org.sscc.study.racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarRacingTest {

    @Test
    @DisplayName("전진 횟수가 주어진 값 사이로 들어오는 지 확인")
    public void random() {
        InputValues inputValues = new InputValues(1, 5);
        CarRacing carRacing = new CarRacing(inputValues);
        carRacing.raceStart(new RandomMove());
        List<Record> result = carRacing.getResult();
        assertThat(result.get(4).getPositions().get(0)).isGreaterThanOrEqualTo(0)
                .isLessThanOrEqualTo(5);
    }

    @Test
    @DisplayName("항상 참일때")
    public void nonrandom() {
        InputValues inputValues = new InputValues(1, 5);
        CarRacing carRacing = new CarRacing(inputValues);
        carRacing.raceStart(new AlwaysMove());
        List<Record> result = carRacing.getResult();
        assertThat(result.get(4).getPositions().get(0)).isEqualTo(5);
    }
}