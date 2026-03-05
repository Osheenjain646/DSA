package Questions.Assignments.Topic_011_Bit_Manipulations_2;

import java.util.Scanner;

public class Help_From_Sam {

    // Simple as count the no of set bits of score A
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int help = 0;

        while(A>0){
            if ((A&1)==1){
                help++;
            }
            A = A>>1;
        }

        System.out.println(help);
    }
}
