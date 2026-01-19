package Questions.Assignments.Topic004IntroductionToArrays;

import java.util.*;

public class How_Many_Operation_To_Make_Target_As_Largest_in_Array {
    public static void main(String[] args) {
        int[] arr = {1,4,2};
        int B = 3;
        boolean c=false;
        for (int j : arr) {
            if (j == B) {
                c = true;
                break;
            }
        }
        int count=0;
        if (c==true){
            for (int j : arr) {
                if (j > B) {
                    count++;
                }
            }
        }
        else {
            System.out.println("-1");
            return;
        }
        System.out.println(count);
    }
}
