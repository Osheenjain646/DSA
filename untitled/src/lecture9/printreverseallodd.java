package lecture9;
import java.util.Scanner;
public class printreverseallodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit to print all odd numbers in reverse order: ");
        int num=sc.nextInt();
        for (int i=num;i>0;i--){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
