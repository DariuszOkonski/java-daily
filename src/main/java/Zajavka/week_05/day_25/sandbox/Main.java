package Zajavka.week_05.day_25.sandbox;

public class Main {
    public static void main(String[] args) {

        Pauch pauch = new Pauch(3);

        Kangaroo kangaroo = new Kangaroo(pauch, "Romek", 12);

        System.out.println(kangaroo);
        Pauch pauch1 = kangaroo.getPauch();
        pauch1.setSize(22);
        System.out.println(kangaroo);


        kangaroo = kangaroo
                .withName("Daza")
                .withAge(18);

        System.out.println(kangaroo);

    }
}