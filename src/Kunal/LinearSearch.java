package Kunal;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,45,23,456,67,34};
        int target = 23;
        System.out.println(linearSearch(arr,target));
    }

    static int linearSearch(int[] arr, int target){
        //edge cases
        if(arr == null){
            return -1;
        }
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}