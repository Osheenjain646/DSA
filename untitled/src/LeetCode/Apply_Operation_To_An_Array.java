package LeetCode;

import java.util.*;

public class Apply_Operation_To_An_Array {

    public static int[] applyOperationsBruteForce(int[] nums){

        // Applying the operation

        for (int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
                i++;
            }
        }

        // Shifting all the zeros to the last indexes

        int j=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        for (int i=j; i<nums.length; i++){
            nums[i]=0;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(applyOperationsBruteForce(new int[]{1,2,2,1,1,0})));
        System.out.println(Arrays.toString(applyOperationsBruteForce(new int[]{0,1})));
    }
}
