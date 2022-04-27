package Zajavka.week_08.day_35;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Hashtable hashtable = new Hashtable();
        hashtable.put(1, "darek");
        hashtable.put(2, "marcin");

        System.out.println(Collections.unmodifiableMap(hashtable));


        Object one = hashtable.get(1);
        System.out.println(one);
    }
}
