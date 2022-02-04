package Zajavka.week_04.day_19.animal;

import Zajavka.week_04.day_19.animal2.Animal;

public class Cat extends Animal{
    private String surname;
    private boolean isBlack;

    public Cat(String surname) {
        this();
        this.surname = surname;
    }

    public Cat() {
        super();
        this.isBlack = true;
    }
}
