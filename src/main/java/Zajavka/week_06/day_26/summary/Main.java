package Zajavka.week_06.day_26.summary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int resolvedEnumIndex = 2;

        int someOrdinal = Animal.CROCODILE.ordinal();

        System.out.println(someOrdinal);


        Animal animal = Animal.values()[someOrdinal];
        System.out.println(animal);
    }
}
