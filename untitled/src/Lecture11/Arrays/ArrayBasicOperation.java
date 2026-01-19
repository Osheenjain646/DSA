package Lecture11.Arrays;

public class ArrayBasicOperation {
    public static void main(String[] args) {
        // Hardcoded Array

        int [] marks = {10,20,40,60,80};
        System.out.println(marks.length);

        // printing the elements of marks array
        System.out.println(marks[0]);

        // Update
        marks[0] +=2;
        System.out.println(marks[0]);

        // Out of bound accessing the array
        // marks[10] +=2; // runtime exception

        // Accessing all elements of the array to print it
        for (int i=0; i<(marks.length); i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        // for each loop
        for (int x : marks) {
            System.out.print(x + " ");
        }
    }
}
