package Zajavka.week_04.day_20.animal;

import Zajavka.week_04.day_20.animal2.Animal;

public class Cat extends Animal {
    private String name = "tasza";

    {
        this.name = "szasz";
    }

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
