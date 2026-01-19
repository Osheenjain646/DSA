package LeetCode;

public class Single_Number {

    public static int singleNumberOptimal(int[] nums) {
        for (int i=1;i<nums.length;i++){
            nums[0]=nums[0]^nums[i];
        }
        return nums[0];
    }

    public static int singleNumber(int[] nums) {
        int ans=0;
        for (int num : nums) {
            ans = ans ^ num;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber(new int[]{1}));
        System.out.println(singleNumberOptimal(new int[]{2,2,1}));
        System.out.println(singleNumberOptimal(new int[]{4,1,2,1,2}));
        System.out.println(singleNumberOptimal(new int[]{1}));
    }
}
