package Lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class IndicesReturnOfOccurrencesMethod1 {

    public static int[] SearchAll(int[] arr ,int element){

        int count=0;

        // counting the occurrence of the element
        for (int i =0; i<=(arr.length-1); i++){
            if (arr[i]==element)
                count++;
        }

        // creating the array of the count size to store the indices into it
        int [] Output_Array = new int[count];

        // initialising j=0 to put indices into the array at correct position
        int j =0;

        // loop for inputting the indices into the array
        for (int i =0; i<=(arr.length-1); i++){
            if (arr[i]==element){
                System.out.println(arr[i]);
                Output_Array[j]=i;
                j++;
            }
        }
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
        System.out.print("Enter the element whose occurrence indices needs to be found: ");
        int element = sc.nextInt();

        // Function Calling
        int [] Output_Array = SearchAll(Multiple_Occurrence_Array,element);

        // printing the output array
        System.out.print("The array containing the indices of occurrence of " + element + ": ");
        System.out.println(Arrays.toString(Output_Array));
    }
}
