package Zajavka.week_05.day_22a;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Ostrich());
        animals.add(new Ostrich());
        animals.add(new Mouse());
        animals.add(new Cat());
        animals.add(new Mouse());

        for (Animal animal: animals) {
            animal.run();
        }

    }

    public static void runAnimal(Animal animal) {
        animal.run();
    }
}
