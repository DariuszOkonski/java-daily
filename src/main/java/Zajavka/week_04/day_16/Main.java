package Zajavka.week_04.day_16;

public class Main {
    public static void main(String[] args) {

        Tuna tuna1 = new Tuna();
        Tuna tuna2 = new Tuna();
        Tuna tuna3 = tuna2;

        tuna2.name = "Azor";

        tuna1.swim();
        tuna2.swim();
        tuna3.swim();

    }
}
