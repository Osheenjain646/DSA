package lecture14.TwoDArray;

import java.util.Scanner;

public class WaveLikeOutputFor2DArray {

    public static void Print2DArray(int[][] arr ,int rows, int columns){
        for (int j=0; j<columns; j++){
            if (j%2==0){
                for (int i=0; i<rows; i++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for (int i=rows-1; i>=0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static int[][] CreateArrayUsingUserInput(int rows, int columns){
        Scanner sc = new Scanner(System.in);

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
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of the array: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns in the array: ");
        int columns = sc.nextInt();
        int[][] arr =CreateArrayUsingUserInput(rows,columns);

        Print2DArray(arr,rows,columns);
    }
}
