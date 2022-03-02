package Zajavka.week_06.day_26;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Volkswagen v1 = getV1();
        Volkswagen v2 = getV2();

        System.out.println(v1 == v2);
        System.out.println(v1.equals(v2));


    }


    private static Volkswagen getV2() {
        return Volkswagen.TUAREG;
    }

    private static Volkswagen getV1() {
        return Volkswagen.ARTEON;
    }

    private static Volkswagen getEnum() {
        return Volkswagen.GOLF;
    }
}
