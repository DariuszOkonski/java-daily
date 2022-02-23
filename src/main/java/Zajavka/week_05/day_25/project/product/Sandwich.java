package Zajavka.week_05.day_25.project.product;

import Zajavka.week_05.day_25.project.person.ConsumingMan;
import Zajavka.week_05.day_25.project.person.ProducingMan;

public class Sandwich extends Food {
    public Sandwich(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
