package org.sscc.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.sscc.study.resource.Roster;
import org.sscc.study.resource.Round;

import static org.assertj.core.api.Assertions.assertThat;

class RoundTest {

    @ParameterizedTest
    @ValueSource(ints = {
            1,
            2,
            3,
            4,
            5
    })
    @DisplayName("라운드 진행 테스트")
    void should_ReturnRoundResult(int carCount) {
        //given
        Round round = new Round(new Roster(carCount));
        //when
        Roster rosterAfterRound = round.roundResult();
        //then
        assertThat(rosterAfterRound).isInstanceOf(Roster.class);
    }
}