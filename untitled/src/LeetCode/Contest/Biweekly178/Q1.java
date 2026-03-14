package LeetCode.Contest.Biweekly178;

import java.util.HashMap;

public class Q1 {

    public static int solve(int[] nums){
        int unique = -1;
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if (nums[i]%2==0){
                map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
            }
        }
        for (int i=0; i<nums.length; i++){
            if (map.containsKey(nums[i])&&map.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(solve(new int[]{3,4,2,5,4,6}));
        System.out.println(solve(new int[]{4,4}));
    }
}
