package LeetCode.Contest.Biweekly175;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Q1 {

    public static String reverseByTypeOptimised(String s){
        char[] arr = s.toCharArray();
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        while (start < end) {
            if (!Character.isLetter(arr[start])){
                start++;
            }
            else if(!Character.isLetter(arr[end])){
                end--;
            }
            else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        start = 0;
        end = len - 1;
        while (start < end) {
            if (Character.isLetter(arr[start])){
                start++;
            }
            else if(Character.isLetter(arr[end])){
                end--;
            }
            else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(arr);
    }

    public static String reverseByTypesBruteForce(String s){
        List<Character> letters = new ArrayList<>();
        List<Character> specialCharacters = new ArrayList<>();

        for (char c : s.toCharArray()){
            if (Character.isLetter(c)){
                letters.add(c);
            }
            else {
                specialCharacters.add(c);
            }
        }

        Collections.reverse(letters);
        Collections.reverse(specialCharacters);

        StringBuilder result = new StringBuilder();

        int letter = 0;
        int special = 0;
        for (Character c : s.toCharArray()) {
            if (letters.contains(c)) {
                result.append(letters.get(letter++));
            } else {
                result.append(specialCharacters.get(special++));
            }
        }
        return result.toString();
    }

    static void main() {
        String s = ")ebc#da@f(";
        System.out.println(reverseByTypesBruteForce(s));
    }
}
