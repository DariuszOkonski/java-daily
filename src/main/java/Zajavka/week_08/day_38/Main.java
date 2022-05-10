package Zajavka.week_08.day_38;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Book> bookSet = new HashSet<>();
        Book ogniem_i_java = new Book("Ogniem i Java");
        System.out.println(ogniem_i_java.hashCode());

        bookSet.add(ogniem_i_java);
        ogniem_i_java.setTitle("Ogniem");
        System.out.println(ogniem_i_java.hashCode());
        bookSet.add(ogniem_i_java);


        System.out.println(bookSet);
    }
}























