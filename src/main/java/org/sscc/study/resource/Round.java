package org.sscc.study.resource;

public class Round {
    private final Roster someExhaustClass;

    public Round(Roster roster) {
        this.someExhaustClass = roster;
    }

    public Roster roundResult() {
        executeRound();
        return new Roster(someExhaustClass);
    }

    private void executeRound() {
        for (Car car : someExhaustClass.roster()) {
            car.moveForward();
        }
    }
}
