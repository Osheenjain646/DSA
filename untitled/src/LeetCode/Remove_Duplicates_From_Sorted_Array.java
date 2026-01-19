package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class Remove_Duplicates_From_Sorted_Array {

    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[++i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,1,2};
        int[] nums2 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] nums3 = new int[]{-3,-1,0,0,0,1,3};
        System.out.println((removeDuplicates(nums1)));
        System.out.println((removeDuplicates(nums2)));
        System.out.println((removeDuplicates(nums3)));
    }
}
