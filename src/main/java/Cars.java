import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<RacingCar> cars;
    private MoveStrategy strategy;

    public Cars(int carCount, MoveStrategy strategy) {
        this.strategy = strategy;

        cars = new ArrayList<>();
        for (int i = 0; i < carCount; i++) {
            cars.add(new RacingCar(0, strategy));
        }
    }

    public void move() {
        for (RacingCar car : cars) {
            if(strategy.isMoveAble()) {
                car.move();
            }
        }
    }

    public List<Integer> getResult() {

        List<Integer> result = new ArrayList<>();

        for(RacingCar car : cars) {
            result.add(car.getPosition());
        }
        return result;
    }
}