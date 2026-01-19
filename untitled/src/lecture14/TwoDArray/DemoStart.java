package lecture14.TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class DemoStart {

    public static void Print2DArray(int[][] arr){

        System.out.println("Your Array: ");

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void JaggedArray(){
        int[][] arr = {{1,2,3} , {4,5,6,7} , {8,9,10,11,12}};  // known as jagged array

        System.out.println(arr);//Print the array address
        System.out.println(Arrays.toString(arr[0]));//Print the object or array at index 0 in the 2D Array
        System.out.println(Arrays.toString(arr[1]));//Print the object or array at index 1 in the 2D Array
        System.out.println(Arrays.toString(arr[2]));//Print the object or array at index 2 in the 2D Array

        // update
        arr[1][1]=15;
    }

    public static int[][] CreateArrayWithVariableColumns(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of the array: ");
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];

        for (int i=0; i<rows; i++){
            System.out.print("Tell the number of columns in the " + (i+1) + " row: ");
            int columns = sc.nextInt();
            arr[i] = new int[columns]; // created a array of ith row
            // take data input for the row side by side
            System.out.println("Enter the data for " + (i+1) + " row: ");
            for (int j=0; j<columns; j++){
                System.out.print("Enter the value of arr[" + (i+1) + "][" + (j+1) + "]: ");
                arr[i][j]= sc.nextInt();
            }
        }
        return arr;
    }

    public static int[][] CreateArrayUsingUserInput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of the array: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns in the array: ");
        int columns = sc.nextInt();
        //create the array
        int[][] arr = new int[rows][columns];
        // user input for data

        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print("Enter the value of arr[" + (i+1) + "][" + (j+1) + "]: ");
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = CreateArrayUsingUserInput();
        Print2DArray(arr);

        int[][] arr1 = CreateArrayWithVariableColumns();
        Print2DArray(arr1);

        JaggedArray();
    }
}
