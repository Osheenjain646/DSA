package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class Missing_Number {

    public static int missingNumberOptimal(int[] nums){
        int ans = nums.length;
        for(int i=0; i<nums.length; i++){
            ans^=i;
            ans^=nums[i];
        }
        return ans;
    }

    public static int missingNumberBetter2(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }

        for (int i=0; i<=nums.length; i++){
            if (!set.contains(i)){
                return i;
            }
        }
        return -1;
    }

    public static int missingNumberBetter(int[] nums){
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
        System.out.println(missingNumberBetter(new int[]{3,0,1}));
        System.out.println(missingNumberBetter(new int[]{0,1}));
        System.out.println(missingNumberBetter(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumberBetter(new int[]{8,6,4,2,3,5,7,0,1}));

    }
}
