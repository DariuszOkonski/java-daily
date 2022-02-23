package Zajavka.week_05.day_25.project.product;

import Zajavka.week_05.day_25.project.person.ConsumingMan;
import Zajavka.week_05.day_25.project.person.ProducingMan;

public abstract class Food {
    private final String name;
    private final ProducingMan producingMan;
    private final ConsumingMan consumingMan;

    public Food(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        this.name = name;
        this.producingMan = producingMan;
        this.consumingMan = consumingMan;
    }

    @Override
    public String toString() {
        return  this.getClass().getName().substring(39) + "{" +
                "name='" + name + '\'' +
                ", producingMan=" + producingMan +
                ", consumingMan=" + consumingMan +
                '}';
    }
}
