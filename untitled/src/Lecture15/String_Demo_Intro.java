package Lecture15;

import java.util.Scanner;

public class String_Demo_Intro {

    public static void StringBasics(){
        // Declaration

        // First method

        String a = "Hello";
        String b = "Hello";
        String c = b;

        if(a==b && a==c && b==c){
            System.out.println("All Equals");
        }
        else {
            System.out.println("Not Equals");
        }

        // Second Method

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        if (s1 == s2) {
            System.out.println("Equals");
        }
        else {
            System.out.println("Not Equals");
        }

        // .equals() method
        System.out.println(s1 .equals(s2));

        // To access a character of a string
        //System.out.println(s1[0]); // Error

        // using charAt()

        System.out.println(s1.charAt(0));

        // To modify
        // Char array

        char[] arr = s1.toCharArray(); // copy string inside the array but actual string is still unchanged
        arr[0] = 'B';
        System.out.println(arr); // will print Bello
        System.out.println(s1); // Still print Hello
        // To change
        s1 = new String(arr);
        System.out.println(s1);

        // Length
        System.out.println(arr.length); // method in array
        System.out.println(s1.length()); // function in string

    }

    public static void main(String[] args) {
        // Input

        Scanner sc = new Scanner(System.in);
        String firstname = sc .next();
        String lastname = sc.next(); // next() will only read all the characters until a space or blank occurs

        System.out.println(firstname + " " + lastname);

        sc.nextLine();// to consumes the enter or next line

        String line = sc.nextLine();// read until a \n (next line or enter) occurs
        System.out.println(line);

        int n = sc.nextInt();

        // consume the first enter
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line1 = sc.nextLine();
            System.out.println(line1);
        }

        System.out.println("Enter a string with leading spaces: ");
        String str = sc.nextLine();
        System.out.println(str.stripLeading());// remove the leading spaces from the entered string

    }
}
