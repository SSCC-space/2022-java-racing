public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        validNameCheck(name);
        this.name = name;
    }

    private void validNameCheck(String name) {
        if(name.length() > Constant.CAR_NAME_LIMIT) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int move(boolean isSuccess) {
        if(isSuccess){
            position++;
        }
        return position;
    }
}
