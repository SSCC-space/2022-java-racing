package racinggame;

import java.util.ArrayList;

public class Record {
    private final ArrayList<Integer> record;

    public Record(ArrayList<Integer> record) {
        this.record = record;
    }

    public ArrayList<Integer> getRecord() {
        return record;
    }
}
