package Zajavka.week_07.day_33.Part_B;

public class Main {
    public static void main(String[] args) {

        try {
            Animal animal = new Rat(null);

        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}
