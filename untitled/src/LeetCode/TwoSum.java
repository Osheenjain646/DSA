package LeetCode;

import java.util.*;

public class TwoSum {

    public static int[] twoSumHashMapApproach1(int[] nums, int target){
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            map.put(nums[i] , i);
        }

        for (int i=0; i<nums.length; i++){
            int last  = target-nums[i];
            if (map.containsKey(last)&&map.get(last)!=i){
                return new int[]{i, map.get(last)};
            }
        }
        return new int[]{};
    }

    public static int[] twoSumAnotherMethod(int[] nums, int target){
        ArrayList<int[]> numberIndexList = new ArrayList<>();

        for (int i=0; i<nums.length; i++){
            int[] temp = new int[2];
            temp[0] = nums[i];
            temp[1] =i;
            numberIndexList.add(temp);
        }

        numberIndexList.sort((a,b)->a[0]-b[0]);

        int[] result = new int[2];
        int i=0; int j=numberIndexList.size()-1;
        while(i<j){
            int sum= numberIndexList.get(i)[0] +  numberIndexList.get(j)[0];
            if(sum==target){
                result[0]=numberIndexList.get(i)[1];
                result[1]=numberIndexList.get(j)[1];
                break;
            } else if (sum<target) {
                i++;
            }
            else {
                j--;
            }
        }
        return result;
    }

    public static int[] TwoSumOptimalMyMethod(int[] nums, int target){
        // In O(n)

        int i=0; int j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
            j--;
            if (j == i) {

                j=nums.length-1;
                i++;
            }
        }
        return new int[]{};
    }

//    public static int[] TwoSumOptimal(int[] nums, int target){
//        //In O(n)
//
//        // Using Hash value;
//    }

    public static int[] TwoSumBetter(int[] arr, int target){
        for (int i=1; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                if(arr[j-i]+arr[j]==target){
                    return  new int[]{i,j};
                }
            }
        }
        return new  int[]{};
    }

    public static int[] TwoSumBruteForce(int[] arr , int target){
        for (int i=0; i< arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target=6;
        System.out.println(Arrays.toString(TwoSumBruteForce(arr,target)));
        System.out.println(Arrays.toString(TwoSumBetter(arr,target)));
        System.out.println(Arrays.toString(TwoSumOptimalMyMethod(arr,target)));
        System.out.println(Arrays.toString(twoSumAnotherMethod(arr,target)));
        System.out.println(Arrays.toString(twoSumHashMapApproach1(arr,target)));
    }
}
