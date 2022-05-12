package Zajavka.week_08.day_39;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> people = new HashMap<>();

        people.put(1, "Norbert Adamski");
        people.put(2, "Rafal Bernadynski");
        people.put(3, "Cecylia Celibat");

        System.out.println(people);


        System.out.println("Get key: " + people.get(5));
        System.out.println("Get key: " + people.get(2));



    }
}
