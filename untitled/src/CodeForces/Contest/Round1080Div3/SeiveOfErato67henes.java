package CodeForces.Contest.Round1080Div3;

import java.util.Scanner;

public class SeiveOfErato67henes {
    public static  void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int[] arr = new int[n];
            boolean falg = false;
            for (int i=0; i< arr.length; i++){
                arr[i]= sc.nextInt();
                if (arr[i]==67){
                    falg=true;
                }
            }
            if (falg){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
        return;
    }
}
