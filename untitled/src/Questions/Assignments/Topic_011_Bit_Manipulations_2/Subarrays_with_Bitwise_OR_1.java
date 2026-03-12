package Questions.Assignments.Topic_011_Bit_Manipulations_2;

import java.util.Scanner;

public class Subarrays_with_Bitwise_OR_1 {

//    public static int countSubArraysWithBitWiseOR1(int n , int[] bits){
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the bit elements of the array: ");
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter the element " + i+1 + " : " );
            nums[i]= sc.nextInt();
        }
//        System.out.println("Number of SubArrays: " + countSubArraysWithBitWiseOR1(n , nums));
    }
}
