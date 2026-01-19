package lecture9.olderCPPpatternsproblem;

import java.util.Scanner;

public class squarepatternofsquresofnumberuptonineachline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");;
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (j==n){
                    System.out.print(j*j);
                }
                else {
                    System.out.print(j*j + " ");
                }
            }
            System.out.println();
        }
    }
}
// same as for cube of each number