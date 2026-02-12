package LeetCode.Two_Pointer;

public class LC905 {

    public static int[] sortArrayParityOptimal2(int[] nums){
        int i=0; int j=nums.length-1;
        while (i<j){
            if (nums[i]%2!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }else {
                i++;
            }
        }
        return nums;
    }

    public static int[] sortArrayByParityOptimal1(int[] nums){
        int i=0; int j=0;
        while (i<nums.length){
            if (nums[i]%2==0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
            i++;
        }
        return nums;
    }

    public static int[] sortArrayByParityBetter(int[] nums){
        int i=0;
        int j=nums.length-1;
        while (i<j){
            while (i<nums.length && nums[i]%2!=1) i++;
            while (j>=0 && nums[j]%2!=0) j--;
            if (i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i++;
            j--;
        }
        return nums;
    }

    public static int[] sortArrayByParityBruteForce(int[] nums){
        int[] arr=new int[nums.length];
        int j=0;
        for (int num : nums) {
            if (num % 2 == 0) {
                arr[j] = num;
                j++;
            }
        }
        for (int num : nums) {
            if (num % 2 != 0) {
                arr[j] = num;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args){

    }
}
