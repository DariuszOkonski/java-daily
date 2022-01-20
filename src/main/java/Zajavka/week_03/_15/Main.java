package Zajavka.week_03._15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {3,1,2,5,2,6,7,9,3,5,6,2,5,6,8};
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        System.out.println(Arrays.binarySearch(intArray, 7));
        System.out.println(Arrays.binarySearch(intArray, 4));
    }
}
