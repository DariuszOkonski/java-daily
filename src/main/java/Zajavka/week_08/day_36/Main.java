package Zajavka.week_08.day_36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> citiesList = new ArrayList<>();

        citiesList.add("Warsaw");
        citiesList.add("Gdansk");
        citiesList.add("Wroclaw");
        System.out.println(citiesList);

        citiesList.add(1, "SZCZECIN");
        System.out.println(citiesList);

        System.out.println(citiesList.get(0));
    }
}
