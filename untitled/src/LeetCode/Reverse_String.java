package LeetCode;

import java.util.Arrays;

public class Reverse_String {

    public static void reverseString(char[] s){
        int i=0 , j=s.length-1;
        while(i<j){
            char temp1=s[i];
            s[i]=s[j];
            s[j]=temp1;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        String string = new String("hello");
        char[] charArray = string.toCharArray();
        reverseString(charArray);
    }
}
