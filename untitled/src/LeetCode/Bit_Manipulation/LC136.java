package LeetCode.Bit_Manipulation;

public class LC136 {

    public static int singleNumber(int[] nums){
        int ans =0;
        for (int x : nums){
            ans = ans ^ x;
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber(new int[]{1}));
    }
}
