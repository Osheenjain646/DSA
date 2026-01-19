package Lecture11;

import java.util.Scanner;

public class BinaryToDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary value: ");
        long N = sc.nextLong();
        long ans=0L, mul=1L;
        long n=N;
        while (N>0){
            ans += ((N%10)*mul);
            N/=10;
            mul*=2;
        }
        System.out.println("The Decimal value is " + ans);
    }
}
