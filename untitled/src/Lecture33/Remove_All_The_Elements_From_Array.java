package Lecture33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Remove_All_The_Elements_From_Array {

    public static int Better(int[] nums){
        Arrays.sort(nums);
        int[] prefixSum = new int[nums.length];
        prefixSum[0]=nums[0];
        int cost = prefixSum[0];
        for (int i=1; i<nums.length; i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
            cost+=prefixSum[i];
        }
        return cost;
    }

    public static int Brute(int[] nums){
        ArrayList<Integer> integers = new ArrayList<>();
        Arrays.sort(nums);
        for (int x : nums){
            integers.add(x);
        }
        Collections.reverse(integers);
        System.out.println(integers);
        int cost = 0;
        for (int i=0; i<integers.size(); i++){
            cost+=(integers.get(i)*(i+1));
        }
        return cost;
    }

    public static void main(String[] args){
        System.out.println(Brute(new int[]{6,2,1,3}));
        System.out.println(Better(new int[]{6,2,1,3}));
    }
}
