public class RacingGame {

    private final RacingCars cars;

    public RacingGame(String inputNames) {
        this.cars = new RacingCars(inputNames);
    }

    public void startGame(int tryCount){
        for(int i=0; i<tryCount; i++){
            cars.moveCars();
        }
    }

    public void endGame(){
        Winner winner = new Winner(cars.getPositionInfo());
        winner.findWinner();
    }

}
