package Zajavka.week_03._15;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] array = {3,2,5,1};
        printIndexOfArraysElem(array, 5);
        printIndexOfArraysElem(array, 15);


    }

    private static void printIndexOfArraysElem(int[] array, int element) {
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == element){
                System.out.println(i);
                return;
            }
        }

        System.out.println("-1");
    }
}