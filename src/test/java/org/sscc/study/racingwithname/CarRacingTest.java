package org.sscc.study.racingwithname;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarRacingTest {

    @DisplayName("주어진 횟수 이내로 이동하는 지 확인")
    @ParameterizedTest
    @ValueSource(ints = {3, 5, 10})
    public void goRandom(int count) {
        InputValues inputValues = new InputValues("A", count);
        CarRacing carRacing = new CarRacing(inputValues);
        carRacing.raceStart(new RandomMove());
        Record record = carRacing.getResult();
        assertThat(record.getValue("A"))
                .isGreaterThanOrEqualTo(0)
                .isLessThanOrEqualTo(count);
    }

    @Test
    @DisplayName("항상 참일 때 주어진 횟수만큼 이동하는 지 확인")
    public void goAlways() {
        InputValues inputValues = new InputValues("A", 5);
        CarRacing carRacing = new CarRacing(inputValues);
        carRacing.raceStart(new AlwaysMove());
        Record record = carRacing.getResult();
        assertThat(record.getValue("A"))
                .isGreaterThanOrEqualTo(0)
                .isLessThanOrEqualTo(5);
    }

    @DisplayName("한명 이상의 승자가 나오는 지 확인")
    @ParameterizedTest
    @ValueSource(strings = {"A,B,C", "tom,jerry", "kim,park,gu"})
    public void checkWinner(String names) {
        InputValues inputValues = new InputValues(names, 10);
        CarRacing carRacing = new CarRacing(inputValues);
        carRacing.raceStart(new RandomMove());

        Winner winner = new Winner();
        List<String> winners = winner.getWinners(carRacing.getResult());
        assertThat(winners.size()).isGreaterThan(0);
    }

    @Test
    @DisplayName("전진횟수가 같을 때, 모두 승자가 되는 지 확인")
    public void checkWinners() {
        InputValues inputValues = new InputValues("A,B,C", 10);
        CarRacing carRacing = new CarRacing(inputValues);
        carRacing.raceStart(new AlwaysMove());

        Winner winner = new Winner();
        List<String> winners = winner.getWinners(carRacing.getResult());
        assertThat(winners.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("주어진 횟수만큼 실행했는 지 확인")
    public void checkTimes() {
        InputValues inputValues = new InputValues("A", 10);
        CarRacing carRacing = new CarRacing(inputValues);
        carRacing.raceStart(new AlwaysMove());
        assertThat(carRacing.getProcess().size()).isEqualTo(10);
    }

    @Test
    @DisplayName("자동차 이름이 5글자를 넘어갔을 때 에러처리 확인")
    public void nameTest(){
        InputValues inputValues = new InputValues("123456", 10);
        assertThatThrownBy(()->{
            CarRacing carRacing = new CarRacing(inputValues);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}