import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RacingCars {

    private final Map<Car, List<Integer>> positionInfo = new HashMap<>();

    public RacingCars(String inputNames){
        readyGame(splitNames(inputNames));
    }

    private String[] splitNames(String names) {
        return names.split(",");
    }

    private void readyGame(String[] cars) {
        for(String name : cars) {
            positionInfo.put(new Car(name), new ArrayList<>());
        }
    }

    public void moveCars() {
       positionInfo.forEach((k, v) -> v.add(k.move(new RandomMoveStrategy().isMoveAble())));
    }

    public Map<Car, List<Integer>> getPositionInfo() {
        return positionInfo;
    }

}