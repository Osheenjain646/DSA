package OldCPPexa;

import java.util.Scanner;

public class powerofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and their power respectively: ");
        int number = sc.nextInt();
        int power = sc.nextInt();
        double ans = Math.pow(number,power);
        System.out.println("The answer is " + ans);
    }
}
