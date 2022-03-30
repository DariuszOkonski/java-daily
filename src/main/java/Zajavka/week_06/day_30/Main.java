package Zajavka.week_06.day_30;

public class Main {

    private final String CONSTANT = "Some Value";

    public static void main(String[] args) {

        ClassForConstants.CONSTANT = "Hello";
        System.out.println(ClassForConstants.CONSTANT);
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
