package LeetCode.Two_Pointer;

public class LC2149 {

    public static int[] rearrangeArrayOptimal(int[] nums){
        int[] result = new int[nums.length];
        int i=0; int j=1;
        for (int k=0; k<nums.length; k++){
            if (nums[k]>0){
                result[i]=nums[k];
                i+=2;
            }
            else {
                result[j]=nums[k];
                j+=2;
            }
        }
        return result;
    }

    public static int[] rearrangeArrayBetter(int[] nums){
        int[] result = new int[nums.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<nums.length&&j<nums.length){
            while (i<nums.length&&nums[i]<0){
                i++;
            }

            while (j<nums.length&&nums[j]>0){
                j++;
            }

            result[k++]=nums[i];
            result[k++]=nums[j];
            i++;
            j++;
        }
        return result;
    }

    public static int[] rearrangeArrayBruteForce(int[] nums){
        int n = nums.length;
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];
        int[] result = new int[n];
        int i=0;
        int j=0;
        for (int k=0; k<n; k++){
            if (nums[k]>0){
                positive[i++]=nums[k];
            }else {
                negative[j++]=nums[k];
            }
        }

        int k=0;
        int l=0;
        while (l<positive.length){
            result[k++]=positive[l];
            result[k++]=negative[l];
            l++;
        }
        return result;
    }

    public static void main(String[] args){

    }
}
