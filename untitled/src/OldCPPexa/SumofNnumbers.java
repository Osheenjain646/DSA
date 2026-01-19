package OldCPPexa;

import java.util.Scanner;

// Sum of N numbers from 1 to N
public class SumofNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want the sum of all: ");
        int N = sc.nextInt();
        System.out.println("The sum of N numbers is " + ((N*(N+1))/2));
    }
}
