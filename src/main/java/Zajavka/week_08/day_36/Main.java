package Zajavka.week_08.day_36;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("darek");
        listOfStrings.add("marek");
        listOfStrings.add("jagoda");

        List<String> someList = new ArrayList<>();
        someList.add("1");
        someList.add("2");

        listOfStrings.addAll(someList);


    }
}
