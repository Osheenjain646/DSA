package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LC414 {

    public static int thirdMaxBetter(int[] nums){
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        long max3=Long.MIN_VALUE;
        int count=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==max1||nums[i]==max2||nums[i]==max3){
                continue;
            }
            if (nums[i]>max1){
                max3=max2;
                max2=max1;
                max1=nums[i];
                count++;
            }else if(nums[i]>max2&&nums[i]<max1){
                max3=max2;
                max2=nums[i];
                count++;
            }else if (nums[i]>max3&&nums[i]<max2&&nums[i]<max1){
                max3=nums[i];
                count++;
            }
        }
        return count>=3?(int) max3 : (int) max1;
    }

    public static int thirdMaxBruteForce(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int max = nums[n-1];
        int count =1;
        for (int i =n-2; i>=0; i--){
            if (nums[i]!=max){
                max=nums[i];
                count++;
            }
            if (count==3){
                return max;
            }
        }
        return nums[n-1];
    }

    public static void main(String[] args){

    }
}
