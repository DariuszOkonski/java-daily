package Zajavka.week_05.day_23;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Stefan");

        System.out.println(cat);
        method(cat);
        System.out.println(cat);
    }

    public static void method(Cat cat) {
        cat = new Cat("Romus");
    }

}
