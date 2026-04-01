package CodeForces.Contest.AprilFoolsDayContest2026;

import java.util.Scanner;

public class AND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = a + b + c;
            System.out.println((int)(sum/3)+sum%3);
        }
    }
}
