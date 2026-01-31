package LeetCode.Contest.Biweekly175;
import java.math.BigInteger;
public class Q2 {

    public static int nonPositive(int[] nums , int k){
        int operations=0;
        for (int num:nums){
            while (num>0){
                num-=k;
                operations++;
            }
        }
        return operations;
    }

    public static int minimumK(int[] nums){
        int minimum = Integer.MAX_VALUE;
        for (int num : nums) {
            int operations=nonPositive(nums,num);
            if (operations<=(num*num))
                minimum = Math.min(minimum,num);
        }
        return minimum;
    }

    static void main() {
        int[] nums = new int[]{3,7,5};
        int k = minimumK(nums);
    }
}
