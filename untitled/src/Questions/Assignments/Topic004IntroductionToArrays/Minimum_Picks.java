package Questions.Assignments.Topic004IntroductionToArrays;

import java.util.Arrays;

public class Minimum_Picks {

    public static int Solution(int[] arr){
        int maxeven=Integer.MIN_VALUE;
        int minodd=Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]%2==0){
                if (maxeven<arr[i]){
                    maxeven=arr[i];
                }
            }
            else {
                if (minodd>arr[i]){
                    minodd=arr[i];
                }
            }
        }
        return (maxeven-minodd);
    }

    public static void main(String[] args) {
        int[] arr1 = {0,2,9};
        int[] arr2 = {5,17,100,1};

        System.out.println(Solution(arr1));
        System.out.println(Solution(arr2));
    }
}
