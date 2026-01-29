package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class First_Missing_Positive {

    public static int firstMissingPositiveBruteForce(int[] nums) {
        Arrays.sort(nums);
        int missing=1;
        int index=-1;
        for (int i=0;i<nums.length; i++){
            if (nums[i]==1){
                index=i;
                break;
            }
        }
        if (index==-1){return missing;}

        for (int i=index;i<nums.length;i++){
            if (nums[i]!=missing){
                return missing;
            }
            missing++;
        }
        return missing;
    }

    public static int firstMissingPositiveBetter(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for (int i=1; i<=nums.length; i++){
            if (!set.contains(i)){
                return i;
            }
        }
        return nums.length+1;
    }

    public static int firstMissingPositiveOptimal(int[] nums){
        for (int i=0; i<nums.length;i++){
            while ((nums[i]>0&&nums[i]<= nums.length)&&nums[nums[i]-1]!=nums[i]){
                int index=nums[i]-1;

                int temp = nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
            }
        }

        int missing=1;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=missing){
                return missing;
            }
            missing++;
        }
        return missing;
    }

    public static void main(String[] args) {

    }
}
