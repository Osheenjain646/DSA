package Lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class IndicesReturnOfOccurrencesMethod2 {

    public static int[] SearchAll(int[] arr ,int element){
        int n = arr.length;

        // creating array of same length
        int [] Output_Array = new int[n];
        int j=0;

        for (int i=0; i< arr.length; i++){
            if (arr[i]==element){
                Output_Array[j]=i;
                j++;
            }
        }

        // initialising the last element as -1 to identify the limit to print the array in the main class
        Output_Array[j]=-1;

        return Output_Array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputting Multiple occurrences Array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Array Declaration
        int [] Multiple_Occurrence_Array = new int[size];

        // Inputting array elements
        System.out.println("Enter the elements in the array: ");
        for (int i=0; i<=(Multiple_Occurrence_Array.length-1); i++) {
            System.out.print("Element " + (i + 1) + ": ");
            Multiple_Occurrence_Array[i] = sc.nextInt();
        }

        // Inputting element whose occurrence indices needs to be found
        System.out.print("Enter the element whose indices of occurrence needs to be found: ");
        int element = sc.nextInt();

        // Function Calling
        int [] Output_Array = SearchAll(Multiple_Occurrence_Array,element);

        // printing the output array
        System.out.print("The indices of occurrence of " + element + ": ");
        for (int j=0; Output_Array[j]!=-1; j++){
            System.out.print(Output_Array[j] + ",");
        }
    }
}
