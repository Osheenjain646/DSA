package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class N_Repeated_Element_In_Size_2N_Array {

    public static int repeatedNTimesOptimal(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num: nums){
            if (set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }

    public static int repeatedNTimesBruteForce(int[] nums){
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++){
            if (nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        System.out.println(repeatedNTimesBruteForce(new int[] {1,2,3,3}));
        System.out.println(repeatedNTimesBruteForce(new int[] {2,1,2,5,3,2}));
        System.out.println(repeatedNTimesBruteForce(new int[] {5,1,5,2,5,3,5,4}));
        System.out.println(repeatedNTimesOptimal(new int[] {1,2,3,3}));
        System.out.println(repeatedNTimesOptimal(new int[] {2,1,2,5,3,2}));
        System.out.println(repeatedNTimesOptimal(new int[] {5,1,5,2,5,3,5,4}));
    }
}
