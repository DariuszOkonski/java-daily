package Zajavka.week_03._14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] dim2 = {
                {1, 2, 3},
                {1, 2, 7},
                {4, 5, 6}
        };

        System.out.println(Arrays.deepToString(dim2));

        int[][] array = new int[3][];
        System.out.println(Arrays.deepToString(array));
    }
}
