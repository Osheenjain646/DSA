package LeetCode;

import java.util.Arrays;

public class Remove_Element {

    public static int removeElement(int[] nums, int val) {
        int i=0;
        for (int j=0; j<nums.length; j++){
            if (nums[j]!= val){
                nums[i++]=nums[j];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove
        int[] expectedNums = {0,0,1,3,4}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
        Arrays.sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < nums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
