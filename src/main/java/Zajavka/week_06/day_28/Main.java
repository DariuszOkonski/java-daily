package Zajavka.week_06.day_28;

public class Main {

    public static String name;

    public static void main(String[] args) {

        System.out.println(Chair.LEGS_NUMBER);

        Chair chair1 = new Chair();
        Chair chair2 = new Chair();
        Chair chair3 = new Chair();

        chair3.LEGS_NUMBER = 2;

        System.out.println(chair3.LEGS_NUMBER);
        System.out.println(chair2.LEGS_NUMBER);
        System.out.println(chair1.LEGS_NUMBER);

    }
}
