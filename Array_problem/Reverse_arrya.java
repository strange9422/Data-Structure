package Array_problem;

public class Reverse_arrya {
    public static int [] reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        System.out.println("hello");
        int[] a = reverse(arr);
        for(int i : a){
            System.out.print(i + " ");
        }
    }
    
}
