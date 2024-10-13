package Kunal;

import java.util.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,45},
                {4,5,6},
                {7,8,432,9}
        };

        System.out.println(maxIn2DArrays(arr));
    }

    static int maxIn2DArrays(int[][] arr){
        //edge cases
        if(arr == null){
            return -1;
        }
        if(arr.length == 0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
