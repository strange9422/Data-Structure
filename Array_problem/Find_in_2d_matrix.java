package Array_problem;

public class Find_in_2d_matrix {
    boolean binary(int [][] matrix, int row, int n, int target) {
        int start = 0;
        int end = n - 1; // n is the number of columns

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(matrix[row][mid] == target) {
                return true;
            }
            if(matrix[row][mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++) {
            if(matrix[i][0] <= target && matrix[i][n - 1] >= target) {
                return binary(matrix, i, n, target); // pass number of columns, not rows
            }
        }
        return false;
    }

    public boolean optimized_way(int [][] matrix,int Target){
        int m= matrix.length;
        int n=matrix[0].length;
        int start=0;
        int end=m*n -1;

        while(start<=end){
            int mid = start +(end-start)/2;
            int row = mid/n;
            int col=mid%n;
            int midval=matrix[row][col];
            if(midval==Target){
                return true;
            }
            if(midval>Target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
