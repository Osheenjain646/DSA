package LeetCode.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC989 {

    public static List<Integer> addToArrayFormOptimal(int[] num , int k){
        List<Integer> res = new ArrayList<>();
        int i = num.length-1;
        while (i>=0||k>0){
            if (i>=0){
                k+=num[i];
                i--;
            }
            res.add(k%10);
            k/=10;
        }
        Collections.reverse(res);
        return res;
    }

    public static List<Integer> addToArrayFormBetter2(int[] num , int k){
        List<Integer> res = new ArrayList<>();
        int i = num.length-1;
        while(i>=0||k>0){
            if(i>=0){
                k+=num[i];
                i--;
            }
            res.addFirst(k%10);
            k/=10;
        }
        return res;
    }

    public static List<Integer> addToArrayFormBetter1(int[] num , int k){
        List<Integer> res = new ArrayList<>();
        for (int i = num.length-1; i>=0; i--){
            k=k+num[i];
            int number = k%10;
            res.addFirst(number);
            k=k/10;
        }
        while (k>0){
            res.addFirst(k%10);
            k/=10;
        }
        return res;
    }

    public static List<Integer> addToArrayFormBruteForce(int[] num , int k){
        // failed for large size array
        // think of approach with insertion directly at the end of the list
        List<Integer> res = new ArrayList<>();
        long ans =0;
        for (int i=0; i<num.length; i++){
            ans=ans*10+num[i];
        }
        ans=ans+k;
        while (ans>0){
            res.addFirst((int)(ans%10));
            ans/=10;
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(addToArrayFormBruteForce(new int[]{1,2,0,0} , 34));
        System.out.println(addToArrayFormBruteForce(new int[]{2,7,4} , 181));
        System.out.println(addToArrayFormBruteForce(new int[]{2,1,5} , 806));
        System.out.println(addToArrayFormBruteForce(new int[]{9,9,9,9,9,9,9,9,9,9} , 1));
        System.out.println(addToArrayFormBetter1(new int[]{1,2,0,0} , 34));
        System.out.println(addToArrayFormBetter1(new int[]{2,7,4} , 181));
        System.out.println(addToArrayFormBetter1(new int[]{2,1,5} , 806));
        System.out.println(addToArrayFormBetter1(new int[]{9,9,9,9,9,9,9,9,9,9} , 1));
        System.out.println(addToArrayFormBetter2(new int[]{1,2,0,0} , 34));
        System.out.println(addToArrayFormBetter2(new int[]{2,7,4} , 181));
        System.out.println(addToArrayFormBetter2(new int[]{2,1,5} , 806));
        System.out.println(addToArrayFormBetter2(new int[]{9,9,9,9,9,9,9,9,9,9} , 1));
        System.out.println(addToArrayFormOptimal(new int[]{1,2,0,0} , 34));
        System.out.println(addToArrayFormOptimal(new int[]{2,7,4} , 181));
        System.out.println(addToArrayFormOptimal(new int[]{2,1,5} , 806));
        System.out.println(addToArrayFormOptimal(new int[]{9,9,9,9,9,9,9,9,9,9} , 1));
    }
}
