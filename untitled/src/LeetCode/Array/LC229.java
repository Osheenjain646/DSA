package LeetCode.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC229 {

//    public static List<Integer> Better(int[] nums){
//
//    }

    public static List<Integer> Brute(int[] nums){
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0)+1);
        }
        List<Integer> result = new ArrayList<>();
        int OccurrenceRate = (nums.length)/3;
        for(Integer key : hm.keySet()){
            if(hm.get(key)> OccurrenceRate){
                result.add(key);
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(Brute(new int[]{3,2,3}));
        System.out.println(Brute(new int[]{1}));
        System.out.println(Brute(new int[]{1,2}));
    }
}
