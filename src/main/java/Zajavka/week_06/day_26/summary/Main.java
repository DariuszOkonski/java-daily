package Zajavka.week_06.day_26.summary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String crocHello = Animal.CROCODILE.getMessage();

        System.out.println(crocHello);
        System.out.println(Arrays.toString(Animal.values()));

    }
}
