package Zajavka.week_08.day_39;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> people = new HashMap<>();

        people.put(1, "Norbert Adamski");
        people.put(2, "Rafal Bernadynski");
        people.put(3, "Cecylia Celibat");

        Set<Map.Entry<Integer, String>> entries = people.entrySet();
        Set<Integer> keysets = people.keySet();
        Collection<String> values = people.values();

        System.out.println(entries);
        System.out.println(keysets);
        System.out.println(values);


    }
}
