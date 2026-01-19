package Questions.Assignments.Topic001IntroductionToProblemSolving;

import java.util.Scanner;

public class Armstrong_Numbers {

    public static boolean isArmstrong(int N){
        int sum=0;
        int rem=0;
        int actualN=N;
        while (N!=0){
            rem = N%10;
            N = N/10;
            sum+= (int) (rem*rem*rem);
        }
        return sum == actualN;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N = sc.nextInt();
        for (int i=1;i<=N;i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
}
