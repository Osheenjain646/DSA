import java.util.Scanner;
public class printingallnumbersusingforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto whuich you want to print all numbers: ");
        int num = sc.nextInt();
        System.out.println("All numbers from 1 to num");
        for(int i=1; i<=num;i++){
            System.out.println(i+" ");
        }

        System.out.println("All numbers from num to 1");
        for(int j=num; j>=1; j--){
            System.out.println(j+" ");
        }
    }
}
