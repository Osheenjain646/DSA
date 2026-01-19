package Lecture17;

import java.util.Scanner;

public class Sum_Of_Divisors {

    public static int SumOfDivisorsOptimal(int n) {
        int sum=0;
        for (int i=1; i*i<=n; i++) {
            if(n%i==0){
                if(i*i==n){
                    sum+=i;
                }
                else {
                    sum+=(i+(n/i));
                }
            }
        }
        return sum;
    }

    public static int SumOfDivisorsBruteForce(int n) {
        int sum=n+1;
        for (int i=2; i<=(int)(n/2); i++){
            if (n%i==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The sum of divisors of number " + n + " is: " + SumOfDivisorsBruteForce(n));
        System.out.println("The sum of divisors of number " + n + " is: " + SumOfDivisorsOptimal(n));
    }
}
