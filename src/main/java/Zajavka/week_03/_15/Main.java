package Zajavka.week_03._15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {3,1,2,5,2,6,7,9,3,5,6,2,5,6,8};
        System.out.println(Arrays.toString(intArray));
        bubbleSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    private static void bubbleSort(int[] intArray) {
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            sorted = swap(intArray, sorted);
        }
    }

    private static boolean swap(int[] intArray, boolean sorted) {
        for (int i = 0; i < intArray.length - 1; i++) {
            if(intArray[i] > intArray[i + 1]) {
                int temp = intArray[i];
                intArray[i] = intArray[i + 1];
                intArray[i + 1] = temp;
                sorted = false;
            }
        }
        return sorted;
    }
}
