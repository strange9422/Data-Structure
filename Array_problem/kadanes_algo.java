package Array_problem;

public class kadanes_algo {
    public static int maxsubarray(int arr[]){
        int maxsofar=Integer.MIN_VALUE;
        int curr=0;
        for(int i:arr){
            curr+=i;
            if(maxsofar<curr){
                maxsofar=curr;

            }
            if(curr<0){
                curr=0;
            }
        }
        return maxsofar;
    }
    public static void main(String[] args) {
        int [] arr = {1,-5,6,9,-9,};
        System.out.println(maxsubarray(arr));
    }
}
