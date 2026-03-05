package Questions.Assignments.Topic_011_Bit_Manipulations_2;

import java.util.Scanner;

public class Finding_Good_Days {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();  /*unit of food*/

        int well_Behaved_Day=0;

        while (A>0){
            if ((A&1)==1){
                well_Behaved_Day++;
            }
            A = A>>1;
        }
        System.out.println(well_Behaved_Day);
    }
}
