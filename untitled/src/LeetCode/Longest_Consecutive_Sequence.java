package LeetCode;
import java.util.*;
public class Longest_Consecutive_Sequence {

    public static int longestConsecutive(int[] nums) {
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
