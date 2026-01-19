package LeetCode;

import java.util.*;
public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        char[] sarr = s.toLowerCase().toCharArray();
        char[] tarr = t.toLowerCase().toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        return Arrays.equals(sarr,tarr);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat" , "car"));
    }
}
