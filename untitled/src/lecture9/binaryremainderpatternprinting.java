package lecture9;

import java.util.Scanner;

public class binaryremainderpatternprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows: ");
        int n =sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=0; j<i; j++){
                System.out.print((i+j)%2+" ");
            }
            System.out.println();
        }
    }
}
