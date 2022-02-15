package Zajavka.week_05.day_23;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Cat("roman");
        Cat cat = (Cat) animal;

        Cat catt = new Cat("marcin");
        Animal animall = catt;
    }
}
