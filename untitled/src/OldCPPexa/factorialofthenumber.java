package OldCPPexa;

import java.math.BigInteger;
import java.util.Scanner;

public class factorialofthenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is required: ");
        int number = sc.nextInt();
        double fact = 1;
        for (int i=1; i<=number; i++){
            fact*=i;
        }
        System.out.println("The factorial of " + number + " is " + fact);
    }
}
