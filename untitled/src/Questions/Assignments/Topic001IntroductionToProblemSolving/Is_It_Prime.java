package Questions.Assignments.Topic001IntroductionToProblemSolving;

import java.util.Scanner;

public class Is_It_Prime {

    public static boolean isPrime(int number) {
        if (number<=1){
            return false;
        }
        for (int i=2; i<Math.sqrt(number); i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if (isPrime(number)){
            System.out.println("The number " + number + " is a prime number");
        }
        else {
            System.out.println("The number " + number + " is not a prime number");
        }
    }
}
