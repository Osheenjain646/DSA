package Lecture17;

import java.util.Scanner;

public class Fibonacci_Series {

    public static void Fibonacci_Till_The_Limit(int n , int limit){
        int a=0,b=1;
        for (int i=1;i<=n; i++){
            if (a>limit){
                break;
            }
            System.out.print(a+" ");
            int  c=a+b;
            a=b;
            b=c;
        }
    }

    public static void Fibonacci(int n){
        int a =0, b = 1;
        for (int i = 0; i <n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want of Fibonacci series: ");
        int n = sc.nextInt();
        Fibonacci(n);
        System.out.println();
        System.out.println("Enter the number, you want Fibonacci series less than or equal to it: ");
        int limit = sc.nextInt();
        Fibonacci_Till_The_Limit(n, limit);
    }
}
