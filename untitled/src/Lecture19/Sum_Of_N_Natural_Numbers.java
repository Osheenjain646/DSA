package Lecture19;

import java.util.Scanner;

public class Sum_Of_N_Natural_Numbers {

    public static int Approach2(int n){  // O(1)
        return n * (n + 1) / 2;
    }

    public static int Approach1(int n) {  // O(n)
        int sum=0;
        for (int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(Approach1(N));
        System.out.println(Approach2(N));
    }
}
