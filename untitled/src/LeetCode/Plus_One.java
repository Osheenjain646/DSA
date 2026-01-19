package LeetCode;

import java.math.BigInteger;
import java.util.Arrays;

public class Plus_One {

    public static int[] plusOneOptimal(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i]!=9) {
                digits[i]++;
                return digits;
            }
            else  {
                digits[i] = 0;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    public static int[] plusOneBruteForce(int[] digits){
        BigInteger number = BigInteger.ZERO;
        for (int digit : digits) {
            number = number.multiply(BigInteger.TEN).add(BigInteger.valueOf(digit));
        }

        number = number.add(BigInteger.ONE);

        String str = number.toString();
        int[] result = new int[str.length()];
        for(int i=0;i<str.length();i++){
            result[i] = str.charAt(i) - '0';
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOneBruteForce(new int[] {1,2,3})));
        System.out.println(Arrays.toString(plusOneBruteForce(new int[] {9})));
        System.out.println(Arrays.toString(plusOneOptimal(new int[] {1,2,3})));
        System.out.println(Arrays.toString(plusOneOptimal(new int[] {9})));
    }
}
