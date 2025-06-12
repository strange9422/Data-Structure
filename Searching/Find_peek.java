package Searching;
//not resolved yet
public class Find_peek {
    public static int peek(int [] arr,int l,int h){
        int max= Integer.MIN_VALUE;
        int low=l;
        int high=h;

        while(low<high){
            int mid= (low+(high-low))/2;
            if(arr[mid]>max){
                max=arr[mid];
            }

            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else if(arr[mid]<arr[mid-1]){
                high=mid-1;
            }
            else if (arr[mid]==arr[mid+1]){
                int a1=peek(arr,mid+1,high);
                return a1;
            }
            else if(arr[mid]==arr[mid-1]){
              return peek(arr, low,mid-1);
            }
            else{
                int a1=peek(arr,mid+1,high);
                int b1=peek(arr, low,mid-1);
                return Math.max(a1, b1);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr= {1,3,6,6, 7, 2, 1};
        int result = peek(arr,0,arr.length-1);
        System.out.println("The peak element is: " + result);
    }
}
//1 2 3 4 5 6 4 3 2 1