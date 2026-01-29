package LeetCode;
import java.util.*;
public class _4Sum_II {

    public static int fourSumCount(int[] nums1 , int[] nums2 , int[] nums3 , int[] nums4){
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num1 : nums1){
            for(int num2 : nums2){
                int sum=num1+num2;
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int count=0;

        for(int num3 : nums3){
            for(int num4 : nums4){
                int checksum=-(num3+num4);
                count+=map.getOrDefault(checksum, 0);
            }
        }
        return count;
    }

    public  static void main(String[] args) {
        System.out.println(fourSumCount(new int[]{1,2} , new int[]{-2,-1} , new int[]{-1,2} , new int[]{0,2}));
    }
}
