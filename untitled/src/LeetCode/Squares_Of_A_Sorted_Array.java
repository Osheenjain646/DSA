package LeetCode;

import java.util.Arrays;

public class Squares_Of_A_Sorted_Array {

    public static int[] sortedSquaresOptimal(int[] nums) {
        int left =0; int right = nums.length-1; int index=right; int[] result = new int[nums.length];
        while(left<=right){
            int leftval = nums[left]*nums[left];
            int rightval = nums[right]*nums[right];
            if (leftval>rightval){
                result[index--]=leftval;
                left++;
            }
            else {
                result[index--]=rightval;
                right--;
            }
        }
        return result;
    }

    public static int[] sortedSquaresBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]=Math.abs(nums[i]*nums[i]);
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums1 = {-5,-2,0,3,4};
        int[] nums2 = {2,5,9};
        int[] nums3 = {-5,-2,0,3,4};
        int[] nums4 = {2,5,9};
        System.out.println(Arrays.toString(sortedSquaresBruteForce(nums1)));
        System.out.println(Arrays.toString(sortedSquaresBruteForce(nums2)));
        System.out.println(Arrays.toString(sortedSquaresOptimal(nums3)));
        System.out.println(Arrays.toString(sortedSquaresOptimal(nums4)));
    }
}
