package lecture9;

import java.util.Scanner;

public class multipleinputsexa {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int T=sc.nextInt();
        for (int i=1; i<=T; i++){
            System.out.println("Enter the two numbers of the " + i +" line to find out their gcd: ");
            int a = sc.nextInt();
            int b= sc.nextInt();
            int gcd=0;
            for (int j=1; j<=Math.min(a,b); j++) {
                if (a % j == 0 && b % j == 0) {
                    gcd = j;
                }

            }
            System.out.println("The Gcd of "+ i +" line having input "+ a +","+ b +" is "+gcd);
        }
    }
}
