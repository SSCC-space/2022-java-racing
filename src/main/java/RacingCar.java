public class RacingCar {
    private int position;
    private final MoveStrategy strategy;

    public RacingCar(int position, MoveStrategy strategy) {
        this.position = position;
        this.strategy = strategy;
    }

    public int getPosition(){
        return position;
    }

    public void move() {
         position++;
    }
}
