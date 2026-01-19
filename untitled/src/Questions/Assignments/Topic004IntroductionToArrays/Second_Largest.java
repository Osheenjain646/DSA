package Questions.Assignments.Topic004IntroductionToArrays;

import java.util.Arrays;

public class Second_Largest {

    public static int secondLargest(int[] A) {
        if (A.length < 2) {
            return -1;
        }

        Arrays.sort(A);
        return A[A.length-2];
    }

    public static void main(String[] args) {
        int[] A1 = {2, 1, 2};
        int[] A2 = {2};

        System.out.println(secondLargest(A1)); // 2
        System.out.println(secondLargest(A2)); // -1
    }
}


