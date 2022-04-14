package Zajavka.week_07.day_33.Part_A;

public class Main {
    private long parameter;

    public Main(long parameter) {
        if(parameter > 0 && parameter < 10) {
            this.parameter = parameter;
        } else {
            throw new RuntimeException(("what is this dude?"));
        }
    }

    public static void main(String[] args) {

        Main main = new Main(10);

    }
}
