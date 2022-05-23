package Zajavka.week_08.day_40;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] namesArray = {"One", "Two", "Three", "Four"};
        List<String> namesList = new ArrayList<>(Arrays.asList(namesArray));

        String[] strings = namesList.toArray(new String[0]);
        System.out.println(Arrays.toString(strings));

    }
}
