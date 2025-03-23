package Array_problem;

public class Trapping_rain_water {
    public static int another_way(int arr[]){
        int n= arr.length;
        int left [] = new int [n];
        int right [] = new int [n];
        left [0] =arr[0];
        for(int i=1;i<n;i++){
            left[i]= Math.max(left[i-1],arr[i]);
        }
        right[n-1] = arr[n-1];
        for(int j=n-2;j>=0;j--){
            right[j] = Math.max(right[j+1],arr[j]);
        }
        int total=0;
        for(int k=0;k<n;k++){
            total= total + (Math.min(left[k],right[k])-arr[k]);

        }
        return total;
    }
    public static void main(String[] args) {
        int arr [] ={4,2,0,3,2,5};
        int n= arr.length; 
        int l=0;
        int r=n-1;
        int leftmax=Integer.MIN_VALUE;
        int rightmax=Integer.MIN_VALUE;
        int totalwater=0;
        
        while(l<r){
            leftmax=Math.max(leftmax, arr[l]);
            rightmax=Math.max(rightmax, arr[r]);
            if(leftmax<rightmax){
                totalwater=totalwater + (leftmax-arr[l]);
                l++;
            }
            else{
                totalwater=totalwater +(rightmax-arr[r]);
                r--;
            }
        }
        System.out.println(totalwater);
        System.out.println(another_way(arr));
    }
}
