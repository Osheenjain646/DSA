package lecture9.olderCPPpatternsproblem;

import java.util.Scanner;

public class powerofnumberwithrowsandcolumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of column: ");
        int columns = sc.nextInt();
        System.out.println("Enter the power of each number you want; ");
        int pow = sc.nextInt();
        System.out.println("printing powered numbers in each row according to the column number");
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=columns; j++){
                int sum=j;
                for (int k=1; k<pow; k++){
                    sum*=j;
                }
                if (j==columns){
                    System.out.print(sum);
                }
                else {
                    System.out.print(sum + " ");
                }
            }
            System.out.println();
        }
            System.out.println("printing powered numbers in column according to row number");
            for (int i=1; i<=rows; i++){
                for (int j=1; j<=columns; j++){
                    int sum=i;
                    for (int k=1; k<pow; k++){
                        sum*=i;
                    }
                    if (j==columns){
                        System.out.print(sum);
                    }
                    else {
                        System.out.print(sum + " ");
                    }
                }
                System.out.println();
            }
    }
}
