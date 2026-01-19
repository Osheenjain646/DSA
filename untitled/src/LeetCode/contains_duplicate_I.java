package LeetCode;

import java.util.HashSet;

public class contains_duplicate_I {

    public static boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (!set.add(j)) {
                return true;
            }
            set.add(j);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 1, 9};
        System.out.println(containsDuplicate(arr));
    }
}
