package Zajavka.week_08.day_38;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Book> bookSet = new HashSet<>();
        Book singleBook = new Book("Ogniem i Java");

        bookSet.add(singleBook);
        System.out.println(singleBook.hashCode());


        System.out.println(bookSet);
    }
}























