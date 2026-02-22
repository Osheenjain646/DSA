package LeetCode.Contest.Weekly490;

import java.util.ArrayList;
import java.util.Collections;

public class Q2 {
    // Check Digitorial Permutation

    public static int factorial(int n){
        int fact =1;
        for (int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }

    public static boolean isDigitorialPermutation(int n){
        int sum = 0;
        int x = n;
        ArrayList<Integer> Number = new ArrayList<>();
        while (x>0){
            int modulo = x%10;
            sum+=factorial(modulo);
            Number.add(modulo);
            x/=10;
        }

        x=sum;
        ArrayList<Integer> Result = new ArrayList<>();
        while(x>0){
            int ans = x%10;
            Result.add(ans);
            x/=10;
        }

        Collections.sort(Number);
        Collections.sort(Result);
        return Number.equals(Result);
    }

    public static void main(String[] args){
        System.out.println(isDigitorialPermutation(145));  // true
        System.out.println(isDigitorialPermutation(10));   // false
        System.out.println(isDigitorialPermutation(415));  // true
        System.out.println(isDigitorialPermutation(4));    // false
    }
}
