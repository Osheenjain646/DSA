package LeetCode.Bit_Manipulation;

import java.util.Arrays;

public class LC389 {

    public static char Optimal(String s , String t){
        char character =0;
        for (char charS : s.toCharArray()) character ^= charS;
        for (char charT : t.toCharArray()) character ^= charT;
        return character;
    }

    public static char Better1(String s , String t){
        char result =0;
        for (int i=0; i<s.length(); i++){
            result ^= (char) (s.charAt(i) ^ t.charAt(i));
        }

        result ^= t.charAt(t.length()-1);
        return result;
    }

    public static char Better(String s , String t){
        char result =0;
        for (int i=0; i<s.length(); i++){
            result ^= s.charAt(i);
        }

        for (int i=0; i<t.length(); i++){
            result ^= t.charAt(i);
        }

        return result;
    }

    public static char Brute(String s , String t){
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        int i=0;
        int j=0;
        while(i<sArr.length && j<tArr.length){
            if(tArr[j]!=sArr[i]){
                return tArr[j];
            }
            i++;
            j++;
        }
        return tArr[tArr.length-1];
    }

    public static void main(String[] args){
        System.out.println(Brute("abcd" , "abcde"));
        System.out.println(Brute("alskjdhfg" , "alfhskdjgo"));
        System.out.println(Better("abcd" , "abcde"));
        System.out.println(Better("alskjdhfg" , "alfhskdjgo"));
        System.out.println(Better1("abcd" , "abcde"));
        System.out.println(Better1("alskjdhfg" , "alfhskdjgo"));
        System.out.println(Optimal("abcd" , "abcde"));
        System.out.println(Optimal("alskjdhfg" , "alfhskdjgo"));
    }
}
