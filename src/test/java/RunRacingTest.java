import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import racinggame.InputValue;
import racinggame.RacingGame;
import racinggame.AlwaysGo;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RunRacingTest {

    private final InputValue testRacingInput1 = new InputValue(3, 5);
    private final InputValue testRacingInput2 = new InputValue(5, 3);

    AlwaysGo alwaysGo = new AlwaysGo();

    RacingGame racingGame1 = new RacingGame(testRacingInput1);
    RacingGame racingGame2 = new RacingGame(testRacingInput2);


    @Test
    @DisplayName("이동 횟수 테스트")
    public void moveTest() {

        ArrayList<Integer> testCarList1 = new ArrayList<>(Arrays.asList(5, 5, 5));
        ArrayList<Integer> testCarList2 = new ArrayList<>(Arrays.asList(3, 3, 3, 3, 3));

        racingGame1.runRace(alwaysGo);
        racingGame2.runRace(alwaysGo);

        assertThat(racingGame1.getRecords().get(4).getRecord())
                .isEqualTo(testCarList1);
        assertThat(racingGame2.getRecords().get(2).getRecord())
                .isEqualTo(testCarList2);
    }
}