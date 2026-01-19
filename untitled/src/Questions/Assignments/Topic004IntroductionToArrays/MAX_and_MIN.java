package Questions.Assignments.Topic004IntroductionToArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MAX_and_MIN {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);

        int MAX = arr[arr.length-1];
        int MIN = arr[0];

        System.out.println(MAX + "  " + MIN);
    }
}
