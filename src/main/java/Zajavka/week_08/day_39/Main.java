package Zajavka.week_08.day_39;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, List<String>> citiesAttractions = new HashMap<>();

        List<String> warsawAttractions = new ArrayList<>();
        warsawAttractions.add("Palac Kultury i Nauki");
        warsawAttractions.add("Metro Politechnika");
        citiesAttractions.put("Warsaw", warsawAttractions);

        citiesAttractions.put("London", List.of("London's Eye", "Buckingham Palace"));


        Set<Map.Entry<String, List<String>>> citiesAttractionsEntries = citiesAttractions.entrySet();

        System.out.println(citiesAttractions);
        System.out.println(citiesAttractionsEntries);

        for (Map.Entry<String, List<String>> citiesAttractionsEntry : citiesAttractionsEntries) {
            System.out.println(citiesAttractionsEntry.getKey());
            System.out.println(citiesAttractionsEntry.getValue());
        }

        System.out.println("=========");
        Set<String> citiesAttractionsKeys = citiesAttractions.keySet();
        System.out.println(citiesAttractionsKeys);

        System.out.println("==============");
        Collection<List<String>> citiesAttractionsValues = citiesAttractions.values();
        System.out.println(citiesAttractionsValues);
        for (List<String> citiesAttractionsValue : citiesAttractionsValues) {
            for (String s : citiesAttractionsValue) {
                System.out.println(s);
            }
        }
    }
}
