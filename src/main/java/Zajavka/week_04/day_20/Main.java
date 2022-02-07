package Zajavka.week_04.day_20;

import Zajavka.week_04.day_20.animal.Cat;
import Zajavka.week_04.day_20.animal2.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Cat cat1 = new Cat("hello");

        System.out.println(animal);
        System.out.println(cat);
        System.out.println(cat1);
    }
}