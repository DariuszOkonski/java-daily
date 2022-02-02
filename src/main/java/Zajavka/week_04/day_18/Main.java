package Zajavka.week_04.day_18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Building[] buildings = new Building[5];
        buildings[0] = new Hotel();
        buildings[1] = new House();

//        System.out.println(Arrays.toString(buildings));

        for (Building b: buildings) {
            System.out.println(b);
        }
    }
}