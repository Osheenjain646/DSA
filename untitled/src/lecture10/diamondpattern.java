package lecture10;

import java.util.Scanner;

public class diamondpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of rows in the diamond pattern required: ");
        int n= sc.nextInt();
        int mid = (n+1)/2;  // if n=odd then until mid middle row will be included
                            // if n=even then exactly half of total rows will be included in the mid
        for (int i=1; i<=mid; i++){
            for (int j=1; j<=(mid-i); j++){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++){
                if (j==2*i-1){
                    System.out.print("*");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        int lower;
        if(n%2==0){
            lower=mid;
        }
        else {
            lower=mid-1;
        }

        for (int i=lower; i>=1; i--){
            for (int j=1; j<=mid-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++){
                if (j==2*i-1){
                    System.out.print("*");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

//package lecture10;
//
//import java.util.Scanner;
//
//public class diamondpattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the total number of rows in the diamond pattern required: ");
//        int n= sc.nextInt();
//        int mid = (n+1)/2;  // if n=odd then until mid middle row will be included
//        // if n=even then exactly half of total rows will be included in the mid
//        for (int i=1; i<=mid; i++){
//            for (int j=1; j<=(mid-i); j++){
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++){
//                if (j==i){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//
//        int lower;
//        if(n%2==0){
//            lower=mid;
//        }
//        else {
//            lower=mid-1;
//        }
//
//        for (int i=lower; i>=1; i--){
//            for (int j=1; j<=mid-i; j++){
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++){
//                if (j==i){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
