package Zajavka.week_05.day_21;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Persian("Antek");
        animal.setName("Hi");

        String sth = "someString";

        String result = sth.substring(1)
                .toUpperCase(Locale.ROOT)
                .toUpperCase(Locale.ROOT)
                .trim()
                .repeat(2);
    }
}
