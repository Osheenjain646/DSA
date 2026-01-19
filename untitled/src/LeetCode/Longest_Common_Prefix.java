package LeetCode;

import java.util.Arrays;

public class Longest_Common_Prefix {

    public static String longestCommonPrefixOptimal(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        Arrays.sort(strs);
        for (int i=0; i<(Math.min(strs[0].length() , strs[strs.length-1].length()));i++){
            if (strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }

    public static String longestCommonPrefixBetter(String[] strs) {
        String s = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j=0;
            while(j<Math.min(s.length(),strs[i].length())){   // using the Math class for the minimum length until which the loop must go only
                if(s.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            s=s.substring(0,j);
        }
        return s;
    }

    public static String longestCommonPrefixBruteForce(String[] strs) {
        String s = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j<s.length() && j<strs[i].length()){
                if (s.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            s = s.substring(0,j);
        }
        return s;
    }

    public static void main() {
        String[] s = {"flower","flow","flight"};
        System.out.println(longestCommonPrefixBruteForce(s));
        System.out.println(longestCommonPrefixBetter(s));
        System.out.println(longestCommonPrefixOptimal(s));
    }
}
