package Zajavka.week_08.day_40;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        namesList.add("Czarek");
        namesList.add("Marek");
        namesList.add("Darek");

        Cat cat = new Cat(namesList);
        System.out.println(cat.getFriendsNames());

        cat.getFriendsNames().add("Jarek");
        System.out.println(cat.getFriendsNames());
    }
}
