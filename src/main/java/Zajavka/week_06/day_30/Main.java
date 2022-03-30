package Zajavka.week_06.day_30;

import static Zajavka.week_06.day_30.ClassForConstants.CONSTANT;

public class Main {

    public static void main(String[] args) {

        CONSTANT = "Hello";
        System.out.println(CONSTANT);
    }

    public static String returnName() {
        return "returnName";
    }

    public String nonStatic() {

        return "nonStatic";
    }

    public String nonStatic2() {
        return "nonStatic2";
    }
}
