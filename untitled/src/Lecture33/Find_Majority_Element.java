package Lecture33;

import java.util.Arrays;
import java.util.HashMap;

// find that element that is occurred more than n/2 times
public class Find_Majority_Element {

    public static int Optimal(int[] nums){
        // Using the Boyer Moore Algorithm
        int candidate =0;
        int count =0;
        for (int i=0; i<nums.length; i++){
            if (count==0){
                candidate=nums[i];
            }
            if (nums[i]==candidate){
                count++;
            }else {
                count--;
            }
        }
        // if fixed that there must be a majority element in this array then we can simply return the candidate as
        // only the majority element will be present in it at last
        count=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==candidate){
                count++;
            }
        }
        return count>(nums.length/2)?candidate:-1;
    }

    public static int Better3(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static int Better2(int[] nums){
        // Using the HashMap
        HashMap <Integer , Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        }

        for (Integer key : map.keySet()){
            if (map.get(key)>(nums.length/2)){
                return key;
            }
        }
        return -1;
    }

    public static int Better1(int[] nums){
        int count =0;
        int element =0;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i=0; i< nums.length; i++){
            if (element!=nums[i]){
                count=0;
                element=nums[i];
            }
            if (nums[i]==element){
                count++;
            }
            if (count>(n/2)){
                return element;
            }
        }
        return -1;
    }

    public static int Brute(int[] nums){
        int n = nums.length;
        int maxOccurred = 0;
        int element = -1;
        for (int i=0; i<n; i++){
            int count=0;
            for (int j=0; j<n; j++){
                if (nums[j]==nums[i]){
                    count++;
                }
            }
            if (count>maxOccurred){
                element=nums[i];
                maxOccurred=count;
            }
        }
        return maxOccurred>(n/2)?element:-1;
    }

    public static void main(String[] args){
        System.out.println(Brute(new int[]{1,4,4,2,4,4,6,4}));
        System.out.println(Better1(new int[]{1,4,4,2,4,4,6,4}));
        System.out.println(Better2(new int[]{1,4,4,2,4,4,6,4}));
        System.out.println(Better3(new int[]{1,4,4,2,4,4,6,4}));
        System.out.println(Optimal(new int[]{1,4,3,2,4,4,6,4}));
    }
}
