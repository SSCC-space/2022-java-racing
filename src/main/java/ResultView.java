public class ResultView {
    RacingCars cars;
    private Winner winner;

    public void showRacingResult(int tryCount) {
        for(int i=0; i<tryCount; i++) {
            final int index = i;
            cars.getPositionInfo().forEach((k, v) -> showCarPosition(k, v.get(index)));
        }
    }

    public void showWinner() {
        String winnerName = String.join(",", winner.getWinnerNames());
        System.out.println(winnerName + " 가 최종우승했습니다.");
    }

    private void showCarPosition(Car car, int position){

        System.out.println(car.getName() + " : ");
            for (int i=0; i<position; i++) {
                System.out.print(Constant.POSITION_MARK);
            }
            System.out.println();
        };
    }

