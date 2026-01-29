package LeetCode;

import java.util.Arrays;

public class Merge_Strings_Alternatively {

    public static String mergeAlternatively(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        char[] ans =  new char[arr1.length + arr2.length];
        int j=0;
        int i=0;
        for (i=0; i<Math.min(arr1.length, arr2.length); i++){
            ans[j++] = arr1[i];
            ans[j++] = arr2[i];
        }
        boolean longer_String=arr1.length>arr2.length;
        if(longer_String){
            for (int k=i; k<arr1.length; k++){
                ans[j++] = arr1[k];
            }
        }
        else {
            for (int k=i; k<arr2.length; k++){
                ans[j++] = arr2[k];
            }
        }
        return  String.valueOf(ans);
    }

    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "pqrs";
        System.out.println(mergeAlternatively(str1,str2));
    }
}
