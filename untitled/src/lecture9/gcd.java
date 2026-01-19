package lecture9;
import java.util.Scanner;

// gcd:- greatest common divisor

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find the highest common gcd of them: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The highest common gcd of both numbers is " + gcd);
    }
}
