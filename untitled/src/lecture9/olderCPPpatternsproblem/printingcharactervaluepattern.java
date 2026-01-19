package lecture9.olderCPPpatternsproblem;

import java.util.Scanner;

public class printingcharactervaluepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();
        System.out.println("printing alphabets in order in each column");
        for (int i=1; i<=rows; i++){
            char name = (char) ('a'+(i-1));
            for (int j=1; j<=columns; j++){
                if (j==columns) {
                    System.out.print(name);
                }
                else {
                    System.out.print(name + " ");
                }
            }
            System.out.println();
        }
        System.out.println("printing alphabets in order in each row");
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=columns; j++){
                char name = (char) ('a'+(j-1));
                if (j==columns) {
                    System.out.print(name);
                }
                else {
                    System.out.print(name + " ");
                }
            }
            System.out.println();
        }
    }
}
