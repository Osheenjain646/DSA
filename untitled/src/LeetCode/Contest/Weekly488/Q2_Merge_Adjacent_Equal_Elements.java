package LeetCode.Contest.Weekly488;

import java.util.*;

public class Q2_Merge_Adjacent_Equal_Elements {

    public static List<Long> mergeAdjacent(int[] nums){
        if(nums.length==1){
            List<Long> list =  new ArrayList<>();
            list.add((long)nums[0]);
            return list;
        }
        List<Long> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            list.add((long) nums[i]);
        }

        int i=0;
        while(i<list.size()-1){
            if (Objects.equals(list.get(i), list.get(i + 1))){
                list.set(i,(list.get(i)+list.get(i+1)));
                list.remove(i+1);
                if(i!=0){
                    i--;
                }
            }
            else {
                i++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(mergeAdjacent(new int[]{3,1,1,2}));
    }
}
