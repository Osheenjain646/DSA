package Lecture11;

import java.util.Scanner;

public class gcdEuclid {

    public static int gcd(int A, int B){
        for ( ;A!=0; ){
            int A_=B%A;
            int B_=A;
            A=A_;
            B=B_;
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers to find out their gcd using Euclid Algo for GCD: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The gcd of " + a + " and " + b + " is " + gcd(a,b));
    }
}
