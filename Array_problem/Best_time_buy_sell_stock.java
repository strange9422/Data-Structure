package Array_problem;

public class Best_time_buy_sell_stock {
    public static int maxprofit(int arr []){
        int buy=Integer.MAX_VALUE;
        int profit=0;
        for(int i: arr){
            if(i<buy){
                buy=i;
            }
            int curr=i-buy;
            profit=Math.max(curr, profit);
        }
        
        return profit;
    }
    public static void main(String[] args) {
        int [] arr = {4,3,2,1,5,7,8,4,10};
        int profit= maxprofit(arr);
        System.out.println(profit);
    }
}
