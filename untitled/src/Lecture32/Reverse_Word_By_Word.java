package Lecture32;

import java.util.Arrays;

public class Reverse_Word_By_Word {

    public static void reverse(char[] words , int start , int end){
        while (start<end){
            char temp = words[start];
            words[start]=words[end];
            words[end]=temp;
            start++;
            end--;
        }
    }

    public static char[] solveBetter(char[] words){
        int n = words.length;
        reverse(words , 0 , n-1);
        int i=0;
        while (i<n){
            if (words[i]==' '){
                i++;
                continue;
            }
            int j=i;
            while (j<n && words[j]!=' '){
                j++;
            }
            reverse(words , i , j-1);
            i=j;
        }
        return words;
    }

    public static char[] solveBrute(char[] words){
        int n = words.length;
        int k =n-1;
        char[] result = new char[n];
        for (int i=0; i<n; i++){
            if (words[i]==' '){
                result[k]=words[i];
                k--;
                continue;
            }
            int j=i;
            while (j<n && words[j] != ' '){
                j++;
            }
            for (int p=j-1; p>=i; p--){
                result[k]=words[p];
                k--;
            }
            i=j-1;
        }
        return result;
    }

    public static void main(String[] args){
        String sentence = "I like eating apples";
        char[] words = sentence.toCharArray();
        System.out.println(Arrays.toString(solveBrute(words)));
        System.out.println(Arrays.toString(solveBetter(words)));
    }
}
