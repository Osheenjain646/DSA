package lecture9;

import java.util.Scanner;

public class rightsidetrianglenumberpatternprinting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1 ; j<=i; j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }

//printing row number in the respective row

        System.out.println("Printing the respective row number in their row");
        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + i + " ");
            }
            System.out.println();
        }
    }
}
