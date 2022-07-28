import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Winner {
    private final Map<Car, List<Integer>> infoCar;
    private final List<String> winnerNames = new ArrayList<>();
    private int max=0;

    public Winner(Map<Car, List<Integer>> infoCar) {
        this.infoCar = infoCar;
    }

    public List<String> getWinnerNames() {
        return winnerNames;
    }

    public Map<Car, List<Integer>> getInfoCar() {
        return infoCar;
    }

    public void findWinner() {
        findMaxPosition();
        addWinner();
    }

    private void addWinner() {
        for(Car car : infoCar.keySet()){
            if(max == car.getPosition()){
                winnerNames.add(car.getName());
            }
        }
    }

    private void findMaxPosition() {
        for(Car car : infoCar.keySet()){
            max = Math.max(max, car.getPosition());
        }
    }
}
