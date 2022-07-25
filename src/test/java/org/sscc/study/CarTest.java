package org.sscc.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.sscc.study.resource.Car;
import org.sscc.study.resource.NumberGenerator;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, 3",
            "4, 4"
    })
    @DisplayName("생성자 호출 후 현재 위치 테스트")
    void should_ReturnCurrentPosition(int position, int currentPosition) {
        //given

        //when
        Car car = new Car(position);
        //then
        assertThat(car.currentPosition()).isEqualTo(currentPosition);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2",
            "2, 3",
            "3, 4",
            "4, 5"
    })
    @DisplayName("전진 가능한 경우 테스트")
    void should_Move_WhenMovable(int position, int currentPosition) {
        //given
        Car car = new Car(position);
        NumberGenerator someNumber = new MovableNumberGenerator();
        //when
        car.move(someNumber);
        //then
        assertThat(car.currentPosition()).isEqualTo(currentPosition);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, 3",
            "4, 4"
    })
    @DisplayName("전진 불가능한 경우 테스트")
    void should_notMove_WhenNotMovable(int position, int currentPosition) {
        //given
        Car car = new Car(position);
        NumberGenerator someNumber = new NonMovableNumberGenerator();
        //when
        car.move(someNumber);
        //then
        assertThat(car.currentPosition()).isEqualTo(currentPosition);
    }

}

class MovableNumberGenerator extends NumberGenerator {
    @Override
    public boolean isMovable() {
        return 4 >= THRESHOLD;
    }
}

class NonMovableNumberGenerator extends NumberGenerator {
    @Override
    public boolean isMovable() {
        return 3 >= THRESHOLD;
    }
}