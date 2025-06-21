package Array_problem;

public class Largest_Element {
    static int largest(int [] arr){
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>a){
                a=arr[i];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int []arr={12,3,45,67,23};
        System.out.println(Largest_Element.largest(arr));
    }
}
