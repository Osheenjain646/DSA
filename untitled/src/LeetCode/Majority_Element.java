package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Majority_Element {

    public static int majorityElementOptimised(int[] nums){  // Moore Voting algo
        int count =0;
        int Candidate =0;
        for (int num:nums){
            if(count==0) {
                Candidate = num;
            }

            if (num==Candidate){
                count++;
            }
            else {
                count--;
            }
        }
        return Candidate;
    }

    public static int majorityElementOptimal(int[] nums){
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }

        for (int key : map.keySet()){     // for (Map.Entry<Integer , Integer > m : map.entrySet())
                                         // if(m.getValue()>nums.length/2)returnm.getKey();
            if(map.get(key) >nums.length/2){
                return key;
            }
        }
        return -1;
    }

    public static int majorityElementBetter(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static int majorityElementBruteForce(int[] nums) {
        int n =nums.length/2;
        for(int i=0; i<nums.length; i++){
            int count=0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>n){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int[] arr1 ={2,2,1,1,1,2,2};

        System.out.println(majorityElementBruteForce(arr));
        System.out.println(majorityElementBruteForce(arr1));
        System.out.println(majorityElementBetter(arr));
        System.out.println(majorityElementBetter(arr1));
        System.out.println(majorityElementOptimal(arr));
        System.out.println(majorityElementOptimal(arr1));
        System.out.println(majorityElementOptimised(arr));
        System.out.println(majorityElementOptimised(arr1));
        System.out.println(majorityElementOptimised(new int[]{1,1,2,2}));
    }
}
