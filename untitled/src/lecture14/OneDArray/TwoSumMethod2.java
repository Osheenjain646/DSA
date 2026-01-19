package lecture14.OneDArray;

import java.util.Arrays;

public class TwoSumMethod2 {

    // Using two pointer

    public static void Solution(int[] arr,int target){
        // Sort the array first
        Arrays.sort(arr);

        int i=0,j=arr.length-1;

        while (i<j) {
            if (arr[i] + arr[j] == target) {
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j++;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,8,10,13,11,58,7,33};
        int target = 15;
        Solution(arr,target);
    }
}
