package org.sscc.study.resource;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CarListTest {

    @Test
    @DisplayName("자동차 이름 자수 제한 테스트")
    void getShould_ThrowIllegalArgumentException_When_OverMaxNameSize() {
        //given
        CarList carList = new CarList();
        //when

        //then
        assertThatThrownBy(()->carList.add("abcdef")).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("자동차 이름 null, 공백 테스트")
    @ValueSource(strings = {
            " ",
            "  ",
            "\t",
            "\n"
    })
    void should_ThrowIllegalArgumentException_When_NullOrEmptyOrBlank(String carName) {
        //given
        CarList carList = new CarList();
        //when

        //then
        assertThatThrownBy(()->carList.add(carName)).isInstanceOf(IllegalArgumentException.class);
    }
}