package Zajavka.week_08.day_40;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Bartek");
        namesList.add("Karol");

        for (String s : namesList) {
            System.out.println(s);
        }


    }
}
