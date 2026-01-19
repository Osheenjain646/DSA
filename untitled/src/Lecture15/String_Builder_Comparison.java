package Lecture15;

import java.util.Scanner;

public class String_Builder_Comparison {

    static void addtostring(int n){
        String str = "";
        for (int i=0; i<n; i++){
            str+=(char)('A'+i);
//            System.out.println(str);
        }
    }

    static void addtostringusingstringbuilder(int n){
        StringBuilder str = new StringBuilder("");
        for (int i=0; i<n; i++){
            str.append((char)('A'+i));
//            System.out.println(str.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        long start  = System.currentTimeMillis(); // used to get times in milliseconds
        addtostring(n);
        long end  = System.currentTimeMillis();
        System.out.println("Strings added in: "+(end-start)+"ms using String");

        start = System.currentTimeMillis();
        addtostringusingstringbuilder(n);
        end = System.currentTimeMillis();
        System.out.println("Strings added in: "+(end-start)+"ms using stringBuilder");

    }
}
