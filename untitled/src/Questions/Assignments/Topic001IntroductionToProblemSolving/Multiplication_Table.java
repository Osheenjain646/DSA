package Questions.Assignments.Topic001IntroductionToProblemSolving;

import java.util.Scanner;

public class Multiplication_Table {

    public static void Multiplication_Table_Of_N(int N) {
        System.out.println("Multiplication of " + N + " is: ");
        for (int i=1; i<=10; i++){
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int A = sc.nextInt();
        Multiplication_Table_Of_N(A);
    }
}
