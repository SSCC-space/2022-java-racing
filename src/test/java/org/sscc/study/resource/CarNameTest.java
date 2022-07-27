package org.sscc.study.resource;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {

    @Test
    @DisplayName("자동차 이름 자수 제한 테스트")
    void getShould_ThrowIllegalArgumentException_When_OverMaxNameSize() {
        //given
        CarList carList = new CarList();
        //when

        //then
        assertThatThrownBy(() -> carList.add("abcdef")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("일급 컬렉션 테스트")
    void should_ReturnList() {
        //given
        CarList carList = new CarList();
        //when
        carList.add("pobi");
        //then
        assertThat(carList.toList()).hasSameClassAs(new ArrayList<>());
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
        assertThatThrownBy(() -> carList.add(carName)).isInstanceOf(IllegalArgumentException.class);
    }
}