import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private final Cars cars;

    public RacingGame(int carCount, MoveStrategy strategy) {
        this.cars = new Cars(carCount, strategy);
    }

    public void startGame(int tryCount){
        for(int i=0; i<tryCount; i++){
            cars.move();
        }
    }

    public List<Integer> getResult() {
        return cars.getResult();
    }

}
