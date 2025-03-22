package Array_problem;

public class Find_min_max_array {
    public static void main(String[] args) {
        int arr [] = {23,45,26,88};
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i: arr){
            if(min>i){
                min=i;
            }
            if(max<i){
                max=i;
            }
        }
        System.out.println(max +" max");
        System.out.println(min +" min");
    }
}
