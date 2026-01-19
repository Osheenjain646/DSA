package Questions.Assignments.Topic004IntroductionToArrays;

import java.util.Scanner;

public class Separate_Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int T = sc.nextInt();
        for (int i=1; i<=T; i++){
            System.out.println("Enter the size of the Array of test case " + i +": ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements in the array: ");
            for (int j=0; j<arr.length; j++){
                arr[j]= sc.nextInt();
            }
            System.out.print("Odd Elements: ");
            for (int j=0; j<arr.length; j++){
                if (arr[j]%2!=0){
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
            System.out.print("Even Elements: ");
            for (int j=0; j<arr.length; j++){
                if (arr[j]%2==0){
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
