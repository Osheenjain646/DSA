package LeetCode;

import java.util.Arrays;

public class Build_Array_From_Permutation {

    public static void rec (int[] arr, int index){
        if (arr.length<=index){
            return;
        }
        int element = arr[arr[index]];
        rec(arr, index+1);
        arr[index] = element;
    }

    public static int[] buildArrayBruteOptimal(int[] nums) {
         rec(nums, 0);
         return nums;
    }

    public static int[] buildArrayBruteForce(int[] nums){
        int[] ans = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
            System.out.println(Arrays.toString(ans));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArrayBruteForce(new int[]{0,2,1,5,3,4})));
        System.out.println(Arrays.toString(buildArrayBruteOptimal(new int[]{0,2,1,5,3,4})));
    }
}
