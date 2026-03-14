package Questions.Assignments.Topic_011_Bit_Manipulations_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Subarrays_with_Bitwise_OR_1 {

    public static int countSubArraysWithBitWiseOR1(int n , ArrayList<Integer> nums){
        int count = 0;
        for (int i=0; i<nums.size(); i++){
            if (nums.get(i)==1){
                count+=nums.size()-i;
            }else {
                int index = i+1;
                while (index<nums.size()&&nums.get(index)!=1){
                    index++;
                }
                count+=nums.size()-index;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the bit elements of the array: ");
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i=0; i<n; i++){
            System.out.print("Enter the bit " + (i+1) + " : " );
            nums.add(sc.nextInt());
        }
        System.out.println("Number of SubArrays: " + countSubArraysWithBitWiseOR1(n , nums));
    }
}
