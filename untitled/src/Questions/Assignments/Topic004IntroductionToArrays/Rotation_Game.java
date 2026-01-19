package Questions.Assignments.Topic004IntroductionToArrays;

import java.util.*;

public class Rotation_Game {

    public static int[] Output(int[] arr, int size, int rotation){
        int actual = rotation%arr.length;
        if (actual==0){
            return arr;
        }
        else {
            for (int i=0; i<actual; i++){
                int temp = arr[arr.length-1];
                for (int j=arr.length-1; j>0; j--){
                    arr[j]=arr[j-1];
                }
                arr[0]=temp;
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("size of array: ");
        int N = sc.nextInt();

        int[] arr =new int[N];

        System.out.println("Enter the elements: ");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the no of rotation to right: ");
        int B = sc.nextInt();

        System.out.println(Arrays.toString(Output(arr,N,B)));
    }
}
