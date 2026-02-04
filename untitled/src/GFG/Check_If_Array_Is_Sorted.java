package GFG;

import java.util.Arrays;

public class Check_If_Array_Is_Sorted {

    public static boolean isSortedRecursive(int[] arr, int length){
        if (length==0||length==1) return true;

        return arr[length-1]>=arr[length-2] && isSortedRecursive(arr , length-1);
    }

    public static boolean isSortedBetter(int[] arr){
        // Recursive Approach
        return isSortedRecursive(arr,arr.length);
    }

    public static boolean isSortedBruteForce(int[] arr){
        // iterative approach
        if (arr.length==1||arr.length==0){
            return true;
        }
        for (int i=1; i<arr.length;i++){
            if (arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }

    static void main() {

    }
}
