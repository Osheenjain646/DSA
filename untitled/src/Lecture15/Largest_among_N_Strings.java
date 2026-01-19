package Lecture15;

import java.util.Scanner;

public class Largest_among_N_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings to be checked for largest: ");
        int n = sc.nextInt();
        sc.nextLine();
        int largestStringLength=0;
        String LargestString="";
        System.out.println("Enter the strings: ");
        for (int i = 1; i <= n; i++) {
            String str = sc.nextLine();
            if (str.length() > largestStringLength) {
                largestStringLength = str.length();
                LargestString = str;
            }
        }
        System.out.println("The largest string length is: " + largestStringLength
        + "\nLargest String is: " + LargestString);
    }
}
