package Sorting_algorithms;
//pick up each element and check whether any element present greater than it at left side,if it existe replace it
//do it for all elemetes 
public class insertion_sort {
    static int [] insertion_sorting(int [] arr){
        int n=arr.length;
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={12,1,23,5,3,45,11,67,33};
        arr=insertion_sorting(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
