package Zajavka.week_04.day_17;

public class Main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator("Sony");
        Calculator calc2 = new Calculator("Sony");

        System.out.println(calc1 == calc2);
        System.out.println(calc1.equals(calc2));

    }
}
