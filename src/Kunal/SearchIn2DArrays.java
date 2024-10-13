package Kunal;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,45},
                {4,5,6},
                {7,8,432,9}
        };
        int target = 6;

        System.out.println(Arrays.toString(searchIn2DArrays(arr, target)));
    }

    static int[] searchIn2DArrays(int[][] arr, int target){
        //edge cases
        if(arr == null){
            return new int[]{-1};
        }
        if(arr.length == 0){
            return new int[]{-1};
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }
}
