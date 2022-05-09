package Zajavka.week_08.day_38;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Car> carSet = new HashSet<>();
        Car car1 = new Car("BMW", "X1", 2020);
        Car car2 = new Car("BMW", "X1", 2020);
        Car car3 = new Car("BMW", "X1", 2020);

//        carSet.add(car1);
//        carSet.add(car2);
        carSet.add(car3);
        System.out.println(carSet);

        car3.setCompany("Audi");
        carSet.add(car3);

        System.out.println(carSet);
    }
}























