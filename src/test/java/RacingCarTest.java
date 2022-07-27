import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RacingCarTest {

    private final RacingCar racingCar = new RacingCar(0, () -> true);

    @Test
    @DisplayName("Racing Car 전진시 successCount 증가 테스트")
    void moveTest() {
        racingCar.move();
        racingCar.move();
        assertThat(racingCar.getPosition()).isEqualTo(2);
    }
}

