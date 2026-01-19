package LeetCode;

import java.util.Arrays;

public class Four_Divisors {

    public static int sumFourDivisors(int[] nums) {
        int sum =0;
        for (int num : nums) {
            int tempSum =0;
            int count =0;
            for (int i=1; i*i<=num; i++){
                if (num%i==0){
                    count++;
                    tempSum+=i;
                    if (i*i!=num){
                        tempSum+=num/i;
                        count++;
                    }
                }
            }
            if (count==4){
                sum+=tempSum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFourDivisors(new int[]{21,4,7}));
        System.out.println(sumFourDivisors(new int[]{21,21}));
        System.out.println(sumFourDivisors(new int[]{1,2,3,4,5}));
    }
}
