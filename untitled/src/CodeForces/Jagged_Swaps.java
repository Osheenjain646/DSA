package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Jagged_Swaps {
    public static void main(String[] args) {
        // brute force but not work as checking only once but never check again for the correctness again
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int[]  arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
//            int[] checkedArray = arr.clone();
//            Arrays.sort(checkedArray);
//            for (int i = 1; i <n-1; i++){        // can't be checked again
//                if(arr[i-1]<arr[i] && arr[i]>arr[i+1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//            if (arr==checkedArray){
//                System.out.println("YES");
//            }else {
//                System.out.println("NO");
//            }
//        }
//        return;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[]  arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if(arr[0]>1){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
        }
        return;
    }
}
