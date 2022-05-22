package Zajavka.week_08.day_39;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, List<String>> citiesAttractions = new HashMap<>();

        List<String> warsawAttractions = new ArrayList<>();
        warsawAttractions.add("Palac Kultury i Nauki");
        warsawAttractions.add("Metro Politechnika");
        citiesAttractions.put("Warsaw", warsawAttractions);

        citiesAttractions.put("Gdynia", Arrays.asList("Galeria Handlowa Galera", "Tramwaj nr 1"));
        citiesAttractions.put("London", List.of("London's Eye", "Buckingham Palace"));

        System.out.println(citiesAttractions);
    }
}
