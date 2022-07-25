import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingCarGame.InputView;
import racingCarGame.RacingGame;

import static org.assertj.core.api.Assertions.*;

public class RaceGameTest {

    @BeforeEach
    public void init(){
        InputView inputView = new InputView();


        RacingGame racingGame = new RacingGame(3, 5);
    }


    @DisplayName("carStop Test")
    @Test
    private void carStopTest(){
    }
}
