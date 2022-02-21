package Zajavka.week_05.day_25;

public class Main {
    public static void main(String[] args) {

        Kangaroo kangaroo = new Kangaroo("Romek", 12);

        System.out.println(kangaroo);

        kangaroo = kangaroo
                .withName("Daza")
                .withAge(18);

        System.out.println(kangaroo);

    }
}