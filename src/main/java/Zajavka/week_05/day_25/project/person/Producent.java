package Zajavka.week_05.day_25.project.person;

import Zajavka.week_05.day_25.project.product.Chocolate;
import Zajavka.week_05.day_25.project.product.Food;
import Zajavka.week_05.day_25.project.product.Sandwich;
import Zajavka.week_05.day_25.project.product.Soup;

public class Producent extends Person implements ProducingMan{

    public Producent(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void consume(Food food) {
        System.out.println("Producent consuming food: " + food);
    }

    @Override
    public Food produce(String productName, ConsumingMan consumingMan) {
        switch (productName) {
            case "chocolate":
                return new Chocolate(productName, consumingMan);
            case "soup":
                return new Soup(productName, consumingMan);
            default:
                return new Sandwich(productName, consumingMan);
        }
    }
}