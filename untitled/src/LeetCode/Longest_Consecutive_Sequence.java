package LeetCode;
import java.util.*;
public class Longest_Consecutive_Sequence {

    public static int longestConsecutivebruteforceoptimal(int[] nums) {
        if (nums.length==0) return 0;

        Arrays.sort(nums);
        int count=1;
        int maxcount=1;

        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]+1){
                count++;
            }
            else if(nums[i]!=nums[i-1]){
                maxcount=Math.max(maxcount,count);
                count=1;
            }
        }
        maxcount=Math.max(maxcount,count);
        return maxcount;
    }

    public static int longestConsecutivebetter(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max=0;
        for(int num : set){
            if(!set.contains(num-1)){
                int len=0;
                while(set.contains(num++)){
                    len++;
                }
                max=Math.max(max,len);
            }
        }
        return max;
    }

    static void main() {

    }
}
