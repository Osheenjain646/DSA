package CodeForces;

import java.util.Scanner;

public class Alice_Bob_and_Chocolate {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0, j = n - 1, alice = 0, bob = 0, a = 0, b = 0;
        while (i <= j) {
            if (i == j) {
                if (alice == bob) {
                    a++;
                } else if (alice > bob) {
                    b++;
                } else {
                    a++;
                }
                break;
            }
            alice += arr[i];
            a++;
            bob += arr[j];
            b++;
            i++;
            j--;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
