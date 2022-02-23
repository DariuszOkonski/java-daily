package Zajavka.week_05.day_25.project.person;

import Zajavka.week_05.day_25.project.product.Food;

public interface ProducingMan {
    Food produce(String productName, ConsumingMan consumingMan);
}
