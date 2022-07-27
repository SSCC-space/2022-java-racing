import java.util.List;

public class ResultView {
    public void showCarPosition(List<Integer> carsPosition){

        carsPosition.forEach((it) -> {
            for (int i=0; i<it; i++) {
                System.out.print("-");
            }
            System.out.println();
        });
    }
}
