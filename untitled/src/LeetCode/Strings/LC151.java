package LeetCode.Strings;

import java.util.Arrays;

public class LC151 {

    public static String Better(String s ){
        // To array of strings having the words as elements
        String[] words = s.trim().split("\\s+");  // to remove trailing and multiple spaces
        StringBuilder result = new StringBuilder();
        for (int i=words.length-1; i>=0; i--){
            result.append(words[i]);
            if (i!=0){
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static String Brute(String s){
        // To char array
        // not possible for repeating spaces in between the words
        s=s.trim();
        char[] words = s.toCharArray();
        int n = words.length;
        char[] result = new char[n];
        int k = n-1;
        for (int i=0; i<n; i++){
            if (words[i]==' '){
                result[k]=words[i];
                k--;
                continue;
            }
            int j=i;
            while (j<n && words[j]!=' '){
                j++;
            }
            for (int p=j-1; p>=i; p--){
                result[k]=words[p];
                k--;
            }
            i=j-1;
        }
        return new String(result);
    }

    public static void main(String[] args){
        System.out.println(Brute("the sky is blue"));
        System.out.println(Better("the sky is blue"));
        System.out.println(Brute("    Hello    World     "));
        System.out.println(Better("    Hello    World     "));
    }
}
