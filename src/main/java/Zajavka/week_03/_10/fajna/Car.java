package Zajavka.week_03._10.fajna;

import Zajavka.week_03._10.fajna.niefajna.inny.Engine;

public class Car {
    private String brand;
    private String model;
    private Engine engine;


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
