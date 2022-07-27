package org.sscc.study.racing;

import java.util.List;

public class ResultView {
    public void printResult(List<Record> result) {
        for(Record record : result){
            record.getPositions().forEach(this::printPositions);
            System.out.println();
        }
    }

    private void printPositions(int times){
        for(int i=0; i<times; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}