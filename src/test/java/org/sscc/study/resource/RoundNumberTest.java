package org.sscc.study.resource;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RoundNumberTest {
    @ParameterizedTest
    @ValueSource(ints = {
            -1,
            0
    })
    @DisplayName("라운드 횟수 조건 테스트")
    void should_ThrowIllegalArgumentException_For_InvalidNumber(int number) {
        //given

        //when

        //then
        assertThatThrownBy(() -> new Round(number)).isInstanceOf(IllegalArgumentException.class);
    }

}