package Questions.Assignments.Topic_011_Bit_Manipulations_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Bit_Compression {

    public static int Optimal(ArrayList<Integer> nums){
        int n = nums.size();
        int xorr =0;
        for (int i=0; i<n-1; i++){
            int iVal = nums.get(i);
            int jVal = nums.get(i+1);
            nums.set(i , iVal&jVal);
            nums.set(i+1 , iVal|jVal);
            xorr = xorr ^ nums.get(i);
        }
        return xorr ^ nums.get(n-1);
    }

    public static int Brute(ArrayList<Integer> nums){
        int n = nums.size();
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                int iVal = nums.get(i);
                int jVal = nums.get(j);
                nums.set(i,iVal&jVal);
                nums.set(j,iVal|jVal);
            }
        }
        int xorr = 0;
        for (int i=0; i<n; i++){
            xorr = xorr ^ nums.get(i);
        }
        return xorr;
    }

    public static void main(String[] args) {
        System.out.println(Brute(new ArrayList<>(Arrays.asList(1,3,5))));
        System.out.println(Brute(new ArrayList<Integer>(Arrays.asList(1,1,1))));
        System.out.println(Optimal(new ArrayList<>(Arrays.asList(1,3,5))));
        System.out.println(Optimal(new ArrayList<Integer>(Arrays.asList(1,1,1))));
    }
}
