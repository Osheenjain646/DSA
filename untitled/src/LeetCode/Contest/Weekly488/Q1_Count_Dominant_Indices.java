package LeetCode.Contest.Weekly488;

import java.util.Arrays;

public class Q1_Count_Dominant_Indices {
    public static int countDominantIndices(int[] nums) {
        int n = nums.length;
        int[] suffix_Array = new int[nums.length]; // for calculating the sum of the elements to the right of the element
        suffix_Array[suffix_Array.length - 1] = 0;
        for (int i= suffix_Array.length-2; i>=0; i--){
            suffix_Array[i]=suffix_Array[i+1]+nums[i+1];
        }
        System.out.println(Arrays.toString(suffix_Array));

        int count = 0;
        for (int i=0; i<nums.length-1; i++){
            if (nums[i]>(suffix_Array[i]/(n-i-1))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count = countDominantIndices(new int[]{4,1,2});
        System.out.println(count);
    }
}
