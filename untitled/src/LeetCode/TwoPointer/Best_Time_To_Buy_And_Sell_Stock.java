package LeetCode.TwoPointer;

import java.util.Arrays;

public class Best_Time_To_Buy_And_Sell_Stock {

    // Third approach id DP
    public static int maxProfitOptimalDP(int[] prices){
        // Having the DP is the same as the logic in the better
        int maxProfit=0;
        int stockToBuy=prices[0];
        for (int i : prices){
            maxProfit=Math.max(maxProfit , i-stockToBuy);
            stockToBuy=Math.min(stockToBuy , i);
        }
        return maxProfit;
    }

    public static int maxPProfitOptimal(int[] prices){
        int left=0;
        int right=1;
        int maxProfit=0;
        while (right<prices.length){
            if (prices[left]<prices[right]){
                maxProfit=Math.max(maxProfit , prices[right]-prices[left]);
            }else {
                left=right;
            }
            right++;
        }
        return maxProfit;
    }

    public static int maxProfitBetter(int[] prices){
        int maxProfit=0;
        int stockToBuy=prices[0];
        for (int i=1; i<prices.length; i++){
            if (prices[i]>stockToBuy){
                maxProfit=Math.max(maxProfit , prices[i]-stockToBuy);
            }
            stockToBuy=Math.min(stockToBuy , prices[i]);
        }
        return maxProfit;

    }

    public static int maxProfitBruteForce(int[] prices){    // This will exceed the time limit as of nested loop
        int maxProfit=0;
        for (int i=0; i<prices.length; i++){
            for (int j=i+1; j<prices.length; j++){
                if (prices[j]>prices[i]){
                    maxProfit=Math.max(maxProfit , prices[j]-prices[i]);
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){

    }
}
