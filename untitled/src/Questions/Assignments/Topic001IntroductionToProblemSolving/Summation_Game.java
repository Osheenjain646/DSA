package Questions.Assignments.Topic001IntroductionToProblemSolving;

import java.util.Scanner;

public class Summation_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int result = (n*n+n)/2;
        System.out.println(result);
    }
}
