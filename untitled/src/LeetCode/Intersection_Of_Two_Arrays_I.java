package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection_Of_Two_Arrays_I {

    public static int[] intersectOptimal(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        HashSet<Integer> resultset = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                resultset.add(num);
            }
        }

        int [] result = new int[resultset.size()];
        int index = 0;
        for (int value : resultset){
            result[index++] = value;
        }
        return result;
    }

    public static int[] intersectBetter(int[] nums1, int[] nums2) {
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]){
                if (k==0 || nums1[i] != result[k-1]){
                    result[k] = nums1[i];
                    k++;
                }
                i++;
                j++;

            } else if (nums1[i] > nums2[j]){
                j++;
            }
            else {
                i++;
            }
        }
        return Arrays.copyOf(result, k);
    }

    public static int[] intersectionBruteForce(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    if (!list.contains(i)) {
                        list.add(i);
                    }
                }
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(intersectionBruteForce(nums1,nums2)));
        System.out.println(Arrays.toString(intersectionBruteForce(new int[]{4,9,5} , new int[]{9,4,9,8,4})));
        System.out.println(Arrays.toString(intersectBetter(nums1,nums2)));
        System.out.println(Arrays.toString(intersectBetter(new int[]{4,9,5} , new int[]{9,4,9,8,4})));
        System.out.println(Arrays.toString(intersectOptimal(nums1,nums2)));
        System.out.println(Arrays.toString(intersectOptimal(new int[]{4,9,5} , new int[]{9,4,9,8,4})));
    }
}
