package org.sscc.study.racingwithname;

import java.util.List;

public class ResultView {
    public void printResult(List<Record> result) {
        for(Record record : result){
            record.getKeys().forEach(key->{
                System.out.print(key+":");
                printPositions(record.getValue(key));
            });
            System.out.println();
        }
    }

    private void printPositions(int times){
        for(int i=0; i<times; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public void printWinners(List<String> winners) {
        for(String winner : winners){
            System.out.print(winner+" ");
        }
        System.out.println("가 최종 우승했습니다.");
    }
}