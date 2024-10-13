package Kunal;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Sneha Kunal";
        char target = ' ';
        System.out.println(searchChar(name,target));
//        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean searchChar(String name, char target){
        if( name.isEmpty()){
            return false;
        }

        if(name == null){
            return false;
        }

        //using for each loop
        for(char ch : name.toCharArray()){
            if(ch == target){
                return true;
            }
        }

//        for (int i = 0; i < name.length(); i++) {
//            if (name.charAt(i) == target){
//                return true;
//            }
//        }
        return false;
    }
}
