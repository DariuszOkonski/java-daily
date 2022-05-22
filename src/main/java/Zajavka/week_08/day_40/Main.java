package Zajavka.week_08.day_40;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List<String> listWithCities = new ArrayList<>();
        listWithCities.add("Warszawa");
        listWithCities.add("Gdańsk");
        listWithCities.add("Łódź");
        listWithCities.add("Wrocław");

        ListIterator<String> stringListIterator = listWithCities.listIterator();
        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next());
        }

        while (stringListIterator.hasPrevious()) {
            System.out.println(stringListIterator.previous());
        }

        System.out.println(listWithCities);
    }
}
