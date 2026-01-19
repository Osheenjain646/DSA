package Lecture17;

import java.util.Scanner;

public class Prime {

    public static boolean isPrimeBruteForce(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i<(int)(number/2); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeOptimal(int number) {
        for (int i=2; i*i<=number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (isPrimeOptimal(number)) {
            System.out.println("The number " + number + " is a prime number");
        }else  {
            System.out.println("The number " + number + " is not a prime number");
        }
    }
}
