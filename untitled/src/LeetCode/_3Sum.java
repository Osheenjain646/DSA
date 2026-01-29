package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        for(int i=0; i<len-2; i++){
            if (i>0 && nums[i]==nums[i-1])
                continue;
            int j=i+1;
            int k=len-1;
            while (j<k){
                int sum=nums[i]+nums[j]+nums[k];
                List<Integer> list = new ArrayList<>();
                if (sum==0){
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    while (j<k && nums[j]==nums[j+1]) j++;
                    j++;
                    k--;
                    res.add(list);
                } else if (sum>0) {
                    k--;
                }
                else {
                    j++;
                }
            }
        }
        return res;
    }

    public static List<List<Integer>> threeSumBruteForce(int[] nums) {     // nhi chalega
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0 && j!=i && k!=j && k!=i) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        res.add(list);
                    }
                }
            }
        }
        return res;
    }

    static void main() {

    }
}
