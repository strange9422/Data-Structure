package Array_problem;

import java.util.Arrays;
import java.util.HashMap;

public class contains_duplicate {
    public static boolean duplicate_containe(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: arr){
            if(map.containsKey(i)){
                return  true;
            }else{
                map.put(i, i);
            }
        }
        return false;
    }

    public static boolean alternative(int [] arr) {
        Arrays.sort(arr);
        for(int i= 0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr [] ={1,2,3,2};
        System.out.println(alternative(arr));
        System.out.println(duplicate_containe(arr));
    }
}
