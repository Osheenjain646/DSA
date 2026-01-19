package Questions.Assignments.Topic001IntroductionToProblemSolving;

import java.util.Scanner;

public class Square_root_of_a_number {

    public static int isPerfectSquare(int num){
        if (num<0)
            return -1;
        int root = (int)Math.sqrt(num);
        if (root * root == num){
            return (int)Math.sqrt(num);
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int A = sc.nextInt();
        System.out.println(isPerfectSquare(A));
    }
}
