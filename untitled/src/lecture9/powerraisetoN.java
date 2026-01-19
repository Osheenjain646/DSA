package lecture9;

 import java.util.Scanner;
 public class powerraisetoN {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number and their power respectively: ");
         double num=sc.nextDouble();
         int power=sc.nextInt();
         double ans=num ;
         for(int i =0;i<power-1; i++){
             ans*=num;
         }
         System.out.println("The answer will be "+ans);
     }
 }

// Using while loop
//
//import java.util.Scanner;
// public class powerraisetoN {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number and their power respectively: ");
//         double num=sc.nextDouble();
//         int power=sc.nextInt();
//         double ans=num;
//         int i = 0;
//         while (i<power-1) {
//             ans*=num;
//             i++;
//         }
//         System.out.println("The answer will be "+ans);
//     }
//}
