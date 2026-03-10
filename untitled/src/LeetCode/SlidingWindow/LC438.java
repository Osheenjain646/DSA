package LeetCode.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC438 {

    public static List<Integer> Brute(String s , String p){
        int n = s.length();
        int m = p.length();
        if(m>n){
            return new ArrayList<>();
        }

        int[] pcount = new int[26];
        for(int i=0; i<m; i++){
            pcount[(p.charAt(i)-'a')]++;
        }
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i=0; i<=n-m; i++){
            int[] subcount = new int[26];
            for(int j=i; j<i+m; j++){
                subcount[(s.charAt(j)-'a')]++;
            }
            if(Arrays.equals(pcount, subcount)){
                indices.add(i);
            }
        }
        return indices;
    }

    public static void main(String[] args){
        System.out.println(Brute("cbaebabacd" , "abc"));
        System.out.println(Brute("abab" , "ab"));
    }
}
