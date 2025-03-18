package Sorting_algorithms;

public class bubble_sort {
    static  int [] bubble_sorting(int arr[]){
        int n=arr.length;
        for(int i = n - 1; i >= 0; i--){
            for(int j=0;j<i-1;j++){
                if(arr[j]>arr[j+1]){
                int max=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=max;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={12,1,23,5,3,45,11,67,33};
        arr=bubble_sorting(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
