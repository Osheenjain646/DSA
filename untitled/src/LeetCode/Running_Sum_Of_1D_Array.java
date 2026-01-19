package LeetCode;

import java.util.Arrays;

public class Running_Sum_Of_1D_Array {

    public static int[]  runningSum(int[] nums) {
        for (int i=1; i<nums.length; i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1,2,3,4,5})));

    }
}
