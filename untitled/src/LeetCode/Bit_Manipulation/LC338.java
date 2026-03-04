package LeetCode.Bit_Manipulation;

import java.util.Arrays;

public class LC338 {

    public static int[] Optimal(int n){
        int[] ans = new int[n+1];
        for(int i=1; i<=n; i++){
            ans[i] = ans[i>>1] + (i&1);
        }
        return ans;
    }

    public static int[] Brute(int n){
        int[] ans = new int[n+1];
        for(int i=0; i<=n; i++){
            int num = i;
            int count=0;
            while(num>0){
                if((num&1)==1){
                    count++;
                }
                num = num>>1;
            }
            ans[i]=count;
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(Brute(5)));
        System.out.println(Arrays.toString(Brute(2)));
        System.out.println(Arrays.toString(Optimal(5)));
        System.out.println(Arrays.toString(Optimal(2)));
    }
}
