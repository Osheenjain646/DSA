package LeetCode.Array;

public class LC55 {

    // optimal Better using the DP

    public static boolean Brute(int[] nums){
        int n =nums.length;
        int jump=0;
        for (int i=0; i<n; i++){
            jump = Math.max(jump-1 , nums[i]);
            if (i==n-1)
                break;
            if (jump==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){

    }
}
