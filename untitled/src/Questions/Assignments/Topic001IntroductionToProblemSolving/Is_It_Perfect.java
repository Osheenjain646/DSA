package Questions.Assignments.Topic001IntroductionToProblemSolving;

import java.util.Scanner;

public class Is_It_Perfect {

    public static boolean isPerfect(int number) {
        int sum=0;
        for (int i=1; i<number; i++){
            if (number%i==0){
                sum+=i;
            }
        }
        if (sum==number){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Integers: ");
        int N = sc.nextInt();
        System.out.println("Enter the Integers: ");
        int[] arr = new int[N];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<arr.length; i++){
            if (isPerfect(arr[i])){
                System.out.println("YES " + arr[i] + " is a perfect number");
            }
            else {
                System.out.println("NO " + arr[i] + " is not a perfect number");
            }
        }
    }
}
