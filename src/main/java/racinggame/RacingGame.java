package racinggame;

import java.util.HashMap;

public class RacingGame {
    private final Cars cars;
    private final HashMap<Integer, Record> records;
    private final int racingCount;

    public RacingGame(InputValue inputValue) {
        this.cars = new Cars(inputValue.getCarCount());
        this.records = new HashMap<>();
        this.racingCount = inputValue.getRacingCount();
    }

    public void runRace(MoveCase moveCase) {
        for (int i = 0; i < racingCount; ++i) {
            Record record = cars.makeRecord();
            records.put(i, record);
            cars.decideMove(moveCase);
        }
    }

    public HashMap<Integer, Record> getRecords() {
        return records;
    }
}
