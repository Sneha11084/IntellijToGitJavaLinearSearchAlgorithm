package Kunal;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,5,-7,-3,6,8};
        int target = 8;
        int start = 1;
        int end = 5;
        System.out.println(searchInRange(arr,target,start,end));
    }

    static boolean searchInRange(int[] arr, int target, int start, int end){
        //edge cases
        if(arr == null){
            return false;
        }
        if(arr.length == 0){
            return false;
        }

        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
