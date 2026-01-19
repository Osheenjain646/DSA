package Questions.Assignments.Topic004IntroductionToArrays;

import java.util.Scanner;

public class Search_Element_TestCases {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of testcases: ");
        int T = sc.nextInt();
        for (int i=1; i<=T; i++){
            System.out.println("For test case " + i );
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            int [] arr = new  int[size];
            System.out.println("Enter the elements in the array: ");
            for (int j=0; j<arr.length; j++){
                arr[j]= sc.nextInt();
            }
            System.out.println("Enter the element to search: ");
            int search = sc.nextInt();

            int found=0;
            for (int j=0; j<arr.length; j++){
                if (arr[j]==search){
                    found=1;
                    break;
                }
            }

            System.out.println(found);
        }
    }
}
