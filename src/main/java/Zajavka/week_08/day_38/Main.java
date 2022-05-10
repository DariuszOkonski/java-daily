package Zajavka.week_08.day_38;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> setOfIntegers = new HashSet<>();
        setOfIntegers.add(8);
        setOfIntegers.add(10);
        setOfIntegers.add(25);
        setOfIntegers.add(7);
        setOfIntegers.add(11);

        setOfIntegers.remove(10);

        System.out.println(setOfIntegers);
        System.out.println("---");
        System.out.println(setOfIntegers.contains(8));
        System.out.println(setOfIntegers.isEmpty());
        System.out.println("---");

        for (Integer item: setOfIntegers) {
            System.out.println(item);
        }
    }
}























