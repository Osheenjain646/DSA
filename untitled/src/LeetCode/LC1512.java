package LeetCode;

import java.util.Arrays;

public class LC1512 {

    public static int numIdenticalPairsOptimal(int[] nums){
        int count=0; int[] frequency = new int[101];
        for (int num : nums){
            count+=frequency[num]++;
        }
        return count;
    }

    public static int numIdenticalPairsBetter(int[] nums){
        int count=0;
        int max = Arrays.stream(nums).max().getAsInt();
        int[] frequency = new int[max+1];
        for (int i=0; i<nums.length; i++){
            frequency[nums[i]]++;
        }

        for (int num : frequency){
            count+=(num*(num-1))/2;
        }

        return count;
    }

    public static int numIdenticalPairsBruteForce(int[] nums){
        int count=0;
        for (int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){

    }
}
