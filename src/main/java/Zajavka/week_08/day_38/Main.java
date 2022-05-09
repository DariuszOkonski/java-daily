package Zajavka.week_08.day_38;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Gdansk");
        set.add("Gdansk");
        set.add("Zabrze");

        method(set);
    }

    private static void method(Set<String> stringSet) {
        for (String s: stringSet) {
            System.out.println(s);;
        }
    }
}























