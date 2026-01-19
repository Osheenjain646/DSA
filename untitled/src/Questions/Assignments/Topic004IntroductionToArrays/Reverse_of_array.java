package Questions.Assignments.Topic004IntroductionToArrays;

import java.util.Arrays;
import java.util.*;

public class Reverse_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr1 = new int[size];
        arr1 = arr;

        int i=0 , j=arr.length-1;
        while (i<j){
            int temp =arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr1));
    }
}
