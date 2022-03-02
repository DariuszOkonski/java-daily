package Zajavka.week_06.day_26;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Volkswagen v1 = getV1();

        System.out.println(v1);
        System.out.println(v1.isMissing());


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
