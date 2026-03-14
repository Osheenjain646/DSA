package LeetCode.Contest.Biweekly178;

import java.util.Arrays;

public class Q2 {

    public static int gcd(int a , int b){
        while (b!=0){
            int temp = a%b;
            a=b;
            b=temp;
        }
        return a;
    }

    public static int solve(int[] nums){
        int n = nums.length;
        int[] maxi = new int[n];
        int[] prefixGCD = new int[n];
        int max=0;
        for (int i=0; i<n; i++){
            max=Math.max(max , nums[i]);
            maxi[i]=max;
            prefixGCD[i]=gcd(maxi[i] , nums[i]);
        }
        Arrays.sort(prefixGCD);
        int i=0;
        int j=n-1;
        int result=0;
        while (i<j){
            result+=gcd(prefixGCD[j] , prefixGCD[i]);
            i++;
            j--;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(solve(new int[]{2,6,4}));
        System.out.println(solve(new int[]{3,6,2,8}));
    }
}
