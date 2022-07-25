package org.sscc.study.resource;

public class Round {
    private final Roster someExhaustClass;

    private NumberGenerator randomNumber = new NumberGenerator();

    public Round(Roster roster) {
        this.someExhaustClass = roster;
    }

    public Roster roundResult() {
        executeRound();
        return new Roster(someExhaustClass);
    }

    private void executeRound() {
        for (Car car : someExhaustClass.roster()) {
            car.move(randomNumber);
        }
    }
}
