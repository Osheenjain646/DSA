package lecture9;
import java.util.Scanner;
public class primenumberidentification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is prime or not: ");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are " + count + " divisor of the number " + num);
        if (count==2){
            System.out.println("So , it is a prime number.");
        }
        else {
            System.out.println("So , it is not a prime number.");
        }
    }
}
