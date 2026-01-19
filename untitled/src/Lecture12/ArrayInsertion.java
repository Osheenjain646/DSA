package Lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        // array creation
        int[] arr = new int[n+1];

        System.out.println("Enter the elements in the array: ");
        for (int i=0; i< arr.length-1; i++){
            System.out.print("Element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        // print
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the element to be inserted in the array and the position also: ");
        System.out.print("Element: ");
        int element = sc.nextInt();
        System.out.print("Position: ");
        int position = sc.nextInt();

        for (int i= (arr.length-2); i>=position-1; i--){
            arr[i+1]=arr[i];
        }

        arr[position-1]=element;

        // printing new array
        System.out.println(Arrays.toString(arr));

    }
}
