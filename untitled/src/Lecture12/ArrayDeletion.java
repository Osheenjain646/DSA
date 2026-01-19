package Lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        // creating array
        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i=0; i<= (arr.length-1); i++){
            System.out.print("Element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        // printing the inputed array
        System.out.println(Arrays.toString(arr));

        //input for position of the element to be deleted
        System.out.println("Enter the position of the element to be deleted: ");
        int position = sc.nextInt();

        // Overwriting the element to be deleted and putting 0 at the last index
        // show 0 as the last element of the array
//        for (int i = position-1; i<= (arr.length-1); i++){
//            if (i== (arr.length-1)){
//                arr[i]=0;
//            }
//            else {
//                arr[i]=arr[i+1];
//            }
//        }



         // show complete array without last element as 0
         for (int i = position-1; i<= (arr.length-2); i++){
           arr[i]=arr[i+1];
         }

         arr = Arrays.copyOf(arr,arr.length-1);

        // updated array
        System.out.println(Arrays.toString(arr));
    }
}
