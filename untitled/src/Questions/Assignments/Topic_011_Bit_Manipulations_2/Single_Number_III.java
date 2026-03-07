package Questions.Assignments.Topic_011_Bit_Manipulations_2;

import java.util.Arrays;

public class Single_Number_III {

    public static int[] solve(int[] nums){
        int xor =0;
        for (int i=0; i<nums.length; i++){
            xor = xor^nums[i];
        }

        int temp = xor;

        int count=0;
        while ((temp&1)==0){
            count++;
            temp=temp>>1;
        }

        int A =0;
        int B=0;

        for (int i=0; i<nums.length; i++){
            if ((nums[i]&(1<<count))!=0){
                A = A^nums[i];
            }else {
                B = B^nums[i];
            }
        }

        if (A>B){
            return new int[]{B,A};
        }
        return new int[]{A,B};
    }

    public static void main(String[] args){
        int[] A = new int[] {1, 2, 3, 1, 2, 4};
        System.out.println(Arrays.toString(solve(A)));
        int [] B = new int[]{1,2};
        System.out.println(Arrays.toString(solve(B)));
    }
}
