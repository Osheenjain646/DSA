package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC1431 {

    public static List<Boolean> kidsWithCandies(int[] candies , int extraCandies){
        int max=0;
        for(int i=0; i<candies.length; i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();
        for(int i =0 ; i<candies.length; i++){
            if(candies[i]+extraCandies>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args){
        // kids with the greatest number of candies
    }
}
