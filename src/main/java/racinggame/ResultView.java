package racinggame;

import java.util.HashMap;

public class ResultView {
    public void printRace(HashMap<Integer, Record> records) {
        for (Record record : records.values()) {
            printCars(record);
            System.out.println();
        }
    }

    public void printCars(Record record) {
        for (Integer num : record.getRecord()) {
            String result = "-".repeat(num);
            System.out.println(result);
        }


    }
}
