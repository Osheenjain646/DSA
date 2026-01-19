// Switch Case Expression ( another way of writing if-else with simple checks )
package lecture10;

import java.util.Scanner;

public class SwitchCaseExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 0-6 to print the day of the week (starts sunday as 0th day)");
        int day = sc.nextInt();
        switch (day){
            case 1:   // These can be 1-> integers, strings, enum, char etc
                System.out.println("It's Monday");
                break;
            case 2:   // Can't hold complex conditions
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6,0:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("The day less than 0 and greater than 6 does not exist");

        }
    }
}
