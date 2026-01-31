package LeetCode.Contest.Biweekly175;
import java.math.BigInteger;
public class Q2 {

    public static int minimumKOptimal(int[] nums) {
        // Using binary search
        int n = nums.length;
        int start = 1;
        int end = n;         // as minimum operation must be nums.length
        for (int num : nums) end = Math.max(end, num);

        int ans = end;
        while (start<=end){
            int mid = start+(end-start)/2;
            long operations=0;
            for (int x : nums){
                if (mid!=0){
                    operations+=(x+mid-1)/mid;
                }
                if (operations>(long) mid*mid) break;
            }
            if (operations<=mid*mid){
                ans=mid;
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return ans;
    }

// Brute Force
//    public static long nonPositive(int[] nums, int k) {
//        long ops = 0;
//        for (int num : nums) {
//            ops += (num + k - 1) / k; // ceil function
//        }
//        return ops;
//    }
//
//    public static int minimumKBruteForce(int[] nums) {
//        int ans = Integer.MAX_VALUE;
//
//        for (int k = 1; k <= 100000; k++) {
//            long ops = nonPositive(nums, k);
//            if (ops <= (long) k * k) {
//                ans = k;
//                break;
//            }
//        }
//        return ans == Integer.MAX_VALUE ? -1 : ans;
//    }

    static void main() {
        int[] nums = {3,7,5};
        int k = minimumKOptimal(nums);
        System.out.println(k);
    }
}
