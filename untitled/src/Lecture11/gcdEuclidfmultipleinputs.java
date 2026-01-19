package Lecture11;

import java.util.Scanner;

public class gcdEuclidfmultipleinputs {

    public static int gcd(int A, int B){
        for ( ; A!=0; ){
            int A_=B%A;
            int B_=A;
            A=A_;
            B=B_;
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            System.out.println("Enter the two numbers of the " + i + " line to find out their gcd: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result=gcd(a,b);
            System.out.println("The Gcd of " + i + " line having input " + a + "," + b + " is " + result);
        }
    }
}
