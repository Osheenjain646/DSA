package Questions.Assignments.Topic004IntroductionToArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multiple_Left_Rotation_Array {

    public static void Solution(int[] A1, int[] B1, int sizeofA1, int sizeofB1){
        int[][] outputarr = new int[sizeofB1][sizeofA1];
        for (int i=0; i<sizeofB1; i++){
            int[] tempA1 = Arrays.copyOf(A1,sizeofA1);
            int actual=B1[i]%sizeofA1;
            if (actual != 0) {
                for (int j = 0; j < actual; j++) {
                    int temp = tempA1[0];
                    for (int k = 0; k < sizeofA1 - 1; k++) {
                        tempA1[k] = tempA1[k + 1];
                    }
                    tempA1[sizeofA1 - 1] = temp;
                }
            }
            outputarr[i] = tempA1;
        }
        System.out.println(Arrays.deepToString(outputarr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array to be rotated: ");
        int sizeofA1 = sc.nextInt();
        int[] A1 = new int[sizeofA1];

        System.out.println("Enter the elements in the original array: ");
        for (int i=0; i<A1.length; i++){
            A1[i]= sc.nextInt();
        }

        System.out.println("Enter the size of the array which contain the value of how many time to be rotated: ");
        int sizeofB1 = sc.nextInt();
        int[] B1 = new int[sizeofB1];
        System.out.println("Enter the value in rotation array: ");
        for (int i=0; i<B1.length; i++){
            B1[i]= sc.nextInt();
        }

        Solution(A1,B1,sizeofA1,sizeofB1);
    }
}
