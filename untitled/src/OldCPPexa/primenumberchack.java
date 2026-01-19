package OldCPPexa;

import java.util.Scanner;

public class primenumberchack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is prime number or not: ");
        int number = sc.nextInt();
        if (number<2){
            System.out.println("Number is not prime");
            System.exit(0);
        }
        else {
            for (int i=2; i<number; i++){
                if (number%i==0){
                    System.out.println("Not a prime number ");
                    System.exit(0);
                }
            }
            System.out.println("It is a prime number");
            System.exit(0);
        }
        System.exit(0);
    }
}
