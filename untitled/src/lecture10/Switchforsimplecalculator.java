package lecture10;

import java.util.Scanner;

public class Switchforsimplecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the calculation in the format of operand1 + operator + operand2");
        double operand1 = sc.nextInt();
        String operator = sc.next();
        double operand2 = sc.nextInt();

        double result;
        switch (operator){
            case "+" : result = operand1+operand2;
                System.out.println(result);
                break;
            case "-" : result = operand1-operand2;
                System.out.println(result);
                break;
            case "*" : result = operand1*operand2;
                System.out.println(result);
                break;
            case "/" : if (operand2==0){
                System.out.println("Divisor can't be zero");
                break;
            }
            else{
                result =operand1/operand2;
                System.out.println(result);
                break;
            }
            default:
                System.out.println("Please enter a valid operator");
        }
    }
}
