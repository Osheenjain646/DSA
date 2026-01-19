package LeetCode;

import java.util.Arrays;

public class Sort_Colors {

    public static int[] sortColorsOptimized(int[] nums) {
        int i=0 , j=0;
        for (int k = 0; k < nums.length; k++) {
            int temp = nums[k];
            nums[k]=2;
            if (temp<2){
                nums[j++]=1;
            }
            if (temp<1){
                nums[i++]=0;
            }
        }
        return nums;
    }

    public static int[] sortColorsOptimal2(int[] nums) {
        int i=0 , j=0 , k=0;
        for(int l=0 ;l< nums.length;l++){
            if(nums[l]==0){
                nums[k++]=2;
                nums[j++]=1;
                nums[i++]=0;
            } else if (nums[l]==1) {
                nums[k++]=2;
                nums[j++]=1;
            }
            else {
                nums[k++]=2;
            }
        }
        return nums;
    }

    public static int[] sortColorsOptimal1(int[] nums) {
        int i=0 , j=nums.length-1 , k=0;
        while (k<=j){
            if (nums[k]==0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                i++;
                k++;
            }
            else if (nums[k]==1){
                k++;
            }
            else {
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
        return nums;
    }

    public static int[] sortColorsBetter2(int[] nums) {
        int[] colorsWeight = new int[3];
        for (int num : nums) {
            colorsWeight[num]++;
        }

        int index=0;
        for (int i = 0; i < 3; i++) {
            while (colorsWeight[i] > 0){
                nums[index++]=i;
                colorsWeight[i]--;
            }
        }
        return nums;
    }

    public static int[] sortColorsBetter1(int[] nums) {// but not acceptable as of O(n^2) complexity
        for (int i = 0; i < nums.length; i++) {
            for (int j=0; j<nums.length-i-1; j++) {
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }

    public static int[] sortColorsBruteForce(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortColorsBruteForce(new int[]{2,0,2,1,0,2})));
        System.out.println(Arrays.toString(sortColorsBetter1(new int[]{2,0,2,1,0,2})));
        System.out.println(Arrays.toString(sortColorsBetter2(new int[]{2,0,2,1,0,2})));
        System.out.println(Arrays.toString(sortColorsOptimal1(new int[]{2,0,2,1,0,2})));
        System.out.println(Arrays.toString(sortColorsOptimal2(new int[]{2,0,2,1,0,2})));
        System.out.println(Arrays.toString(sortColorsOptimized(new int[]{2,0,2,1,0,2})));
    }
}
// Do more practice buddy
