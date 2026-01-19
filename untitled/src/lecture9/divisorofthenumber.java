package lecture9;
import java.util.Scanner;
public class divisorofthenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose divisors are needed: ");
        int num = sc.nextInt();
        System.out.println("The divisor of "+ num +"are: ");
        //for counting the number of divisor
        int count=0;
        for (int i=1; i<=num; i++){
            if (num%i==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are "+ count +" divisor of the number "+ num);
    }
}
