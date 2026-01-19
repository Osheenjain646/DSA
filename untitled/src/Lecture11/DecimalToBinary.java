package Lecture11;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal value: ");
        long N = sc.nextLong();
        long ans =0L , mul=1L , n=N;
        while (N>0){
            ans += (N%2)*mul;
            N/=2;
            mul*=10;
        }
        System.out.println("The Binary value is " + ans);
    }
}
