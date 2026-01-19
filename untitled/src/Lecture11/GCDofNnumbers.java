package Lecture11;

// In this we will find the gcd of N numbers inputed all at once

import java.util.Scanner;

public class GCDofNnumbers {

    public static int gcd(int a, int b){
        while (a!=0){
            int a_=b%a;
            int b_=a;
            a=a_;
            b=b_;
        }
        return b;
    }

    public static void gcdofN(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N = sc.nextInt();
        System.out.println("Enter the value of " + N + " numbers: ");
        int ans = sc.nextInt();
        int result=0;
        for (int i=1; i<N; i++){
            int no_ = sc.nextInt();
            result = gcd(ans,no_);
        }
        System.out.println("The gcd of all numbers is " + result);
    }
    public static void main(String[] args) {
        gcdofN();
    }
}
