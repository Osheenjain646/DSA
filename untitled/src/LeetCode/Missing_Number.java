package LeetCode;

import java.util.Arrays;

public class Missing_Number {

    public static int missingNumberOptimal(int[] nums){
        int OriginalSum=nums.length*(nums.length+1)/2;
        int arrSum=0;
        for (int num:nums){
            arrSum+=num;
        }
        return OriginalSum-arrSum;
    }

    public static int missingNumberBruteForce(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(missingNumberBruteForce(new int[]{3,0,1}));
        System.out.println(missingNumberBruteForce(new int[]{0,1}));
        System.out.println(missingNumberBruteForce(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumberBruteForce(new int[]{8,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumberOptimal(new int[]{3,0,1}));
        System.out.println(missingNumberOptimal(new int[]{0,1}));
        System.out.println(missingNumberOptimal(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumberOptimal(new int[]{8,6,4,2,3,5,7,0,1}));

    }
}
