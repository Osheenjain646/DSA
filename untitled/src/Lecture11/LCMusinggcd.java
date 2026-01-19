package Lecture11;

import java.util.Scanner;

public class LCMusinggcd {

    public static int gcd(int a, int b){
        while (a!=0){
            int a_=b%a;
            int b_=a;
            a=a_;
            b=b_;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pairs of number: ");
        int t = sc.nextInt();
        for (int i=1; i<=t; i++){
            System.out.println("Enter the two numbers of pair " + i);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int LCM = ((a*b)/gcd(a,b));
            System.out.println("The LCM of " + a + " and " + b + " is " + LCM);
        }
    }
}
