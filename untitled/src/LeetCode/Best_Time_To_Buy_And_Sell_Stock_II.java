package LeetCode;

public class Best_Time_To_Buy_And_Sell_Stock_II {

    // 4 more approaches using the dp and recursion
    public static int maxProfitBruteForce(int[] prices){
        // Using greedy algo for best solution
        int maxProfit=0;
        for (int i=1; i<prices.length; i++){
            if (prices[i]>prices[i-1]){
                maxProfit+=prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){

    }
}
