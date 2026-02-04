package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Remove_Duplicates {

    public static int removeDuplicatesOptimized(int[] nums){//LeetCode
        int i=0;
        for (int j=1; j<nums.length; j++){
            if (nums[j]!=nums[i]){
                nums[++i]=nums[j];
            }
        }
        return i+1;
    }

    public static ArrayList<Integer> removeDuplicatesBruteForce(int[] arr){//GFG
        // Using HashSet
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int j : arr) {
            if (!set.contains(j)) {
                list.add(j);
                set.add(j);
            }
        }
        return list;
    }

    static void main() {

    }
}
