package Zajavka.week_06.day_27;

public class Main {
    public static void main(String[] args) {

        HouseBuilder houseBuilder = new HouseBuilder();
        House house = houseBuilder.buildHouse(5.0, "Zajavkowa 7/5, Tarnowo Podgorne");

        System.out.println(house.getArea());
        System.out.println(house.getAddress());

    }
}