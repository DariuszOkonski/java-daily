package Zajavka.week_03._13;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,2,3,11,4,5,3};
        System.out.println(Arrays.toString(array));

        System.out.println("max: " + getMaxElement(array));
        System.out.println("avg: " + getAverage(array));
    }

    private static double getAverage(int[] array) {
        double total = 0.0;
        for (int element : array) {
            total += element;
        }
        return (total / array.length);
    }

    private static int getMaxElement(int[] array) {
        int max = array[0];

        for (int element : array) {
            if(element > max)
                max = element;
        }

        return max;
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
