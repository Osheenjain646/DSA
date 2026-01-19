package Lecture11.Arrays;

import java.util.Scanner;

public class ArrayWithUserInput {

    public static int[] ArrayInput(int[] arr){
        System.out.print("Enter the elements of the array: ");
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        return arr;
    }

    public static void PrintArray(int[] arr){
        System.out.print("Marks: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int FindElement(int[] arr, int element){
        // if present return the index of the array where element is present otherwise return -1
        for (int i=0; i<arr.length; i++){
            if (arr[i]==element){
                return i+1;  // This will not give the actual position of the element in array in memory but give the positon of visualized array
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] marks = new int[n];

        ArrayInput(marks);          // function for inputting thr elements in the array

        PrintArray(marks);          // function to print the elements of the array

        System.out.println(marks); // will give the location of the array stored in the memory

        System.out.print("Enter the element you want to search in the array of marks: ");
        int element = sc.nextInt();
        int indexoffoundedelement=FindElement(marks,element);
        if (indexoffoundedelement==-1){
            System.out.println(element + " is not present in the marks array.");
        }
        else {
            System.out.println("Found " + element + " at index " + indexoffoundedelement + " in the array.");
        }

    }
}
