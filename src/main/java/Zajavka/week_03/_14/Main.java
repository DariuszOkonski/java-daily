package Zajavka.week_03._14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] array = new int[3][3];
        System.out.println(Arrays.deepToString(array));


        String[][] strArray = new String[3][];
        strArray[0] = new String[2];
        strArray[1] = new String[3];
        strArray[2] = new String[4];

        System.out.println(Arrays.deepToString(strArray));



    }
}
