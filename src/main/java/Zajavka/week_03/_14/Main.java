package Zajavka.week_03._14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] dim2 = {
                {1, 2, 3},
                {1, 2, 7},
                {4, 5, 6}
        };

        System.out.println("Main diagonal sum = " + getMainDiagSum(dim2));
    }

    private static int getMainDiagSum(int[][] array) {
        int rowSize = array.length;
        for(int[] row: array) {
            int colSize = row.length;
            if(colSize != rowSize)
                return -1;
        }

        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if(row == col)
                    sum += array[row][col];
            }
        }

        return sum;
    }
}
