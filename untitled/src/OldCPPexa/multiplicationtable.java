package OldCPPexa;

import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose multiplication table is required: ");
        int n = sc.nextInt();
        System.out.println("The multiplication table of " + n + " is as follows ");
        for (int i=1; i<=10; i++){
            System.out.println( n + " * " + i + " = " + n*i );
        }
    }
}
