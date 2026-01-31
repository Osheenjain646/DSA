package LeetCode;
import java.util.*;
public class Subarray_Sum_Equals_K {

    public static int subarraySumBruteForce(int[] nums, int k) {
        int res=0;
         for (int i=0; i<nums.length; i++){
             int sum=0;
             for (int j=i; j<nums.length; j++){
                 sum+=nums[j];
                 if(sum==k) res++;
             }
         }
         return res;
    }

    public static int subarraySumBetter(int[] nums, int k) {
//       Using the hashmap for to store the frequency of the sum appears
         HashMap<Integer , Integer> map = new HashMap<>();
         map.put(0,1);           // putting a 0 as sum with frequency of 1 to handle the situation if sum-k==0 to increase the count or subarray starting from the 0 index
         int sum=0; // to calculate the prefix sum up to current element
         int count=0;
         for(int num : nums){
             sum+=num;

             if(map.containsKey(sum-k)){   // checking if the previous prefix exists
                 count+=map.get(sum-k);   // increase the count of subarray exists
             }

             map.put(sum,map.getOrDefault(sum,0)+1);    // to set the value as number of subarray exists
         }
         return count;
    }

    public static int subarraySumOptimal(int[] nums, int k) {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int num : nums) {
            sum+=num;
            count+=map.getOrDefault((sum-k),0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }

    static void main() {

    }
}
