package Zajavka.week_08.day_41;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello 41a");

        callMe(1);
    }

    private static void callMe(int arg) {
        int number = arg;
        System.out.println(number);
        number++;
        callMe(number);
    }
}