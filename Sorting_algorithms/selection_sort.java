package Sorting_algorithms;
//Time complexity o(n*2)
//traverse the array and find the smallest first and replace it with first element and so on
public class selection_sort {
    static int [] selection_sorting(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int val=arr[min];
                arr[min]=arr[i];
                arr[i]=val;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={12,1,23,5,3,45,11,67,33};
        arr=selection_sorting(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        
    }
}
