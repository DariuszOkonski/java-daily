package Zajavka.week_03._13;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,2,3,4,5,3};
        System.out.println(Arrays.toString(array));

        printArrayElements(array);

    }

    private static void printArrayElements(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length ; i++) {
            if(i == array.length - 1) {
                System.out.print(array[array.length - 1]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
    }
}
