package Zajavka.week_08.day_40;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("one", "Bartek");
        map.put("zero", "Karol");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }
    }
}
