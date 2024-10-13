package Kunal;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,5,-7,-3,6,8};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        //edge cases
        if(arr == null){
            return Integer.MIN_VALUE;
        }
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }

        int minimum = arr[0];
        for(int i : arr){
            if(i < minimum){
                minimum = i;
            }
        }
        return minimum;
    }
}
