package LeetCode;

import java.util.Arrays;

public class Two_Sum_II_Input_Array_Is_Sorted {

    public static int[] twoSumBetter(int[] numbers, int target){  // using good better not exceeding the time limit for another case
        int left =0;
        int right=numbers.length-1;
        while (left<right){
            if(numbers[left]+numbers[right]==target){
                return new int[]{left+1,right+1};
            }
            right--;

            if (right==left){
                right=numbers.length-1;
                left++;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] twoSumOptimal(int[] numbers , int target){  // Binary search method
        int left=0;
        int right=numbers.length-1;
        while (left<right){
            if (numbers[left]+numbers[right]==target){
                return new int[]{left+1,right+1};
            } else if (numbers[left]+numbers[right]>target) {
                right--;
            }
            else {
                left++;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] twoSumBruteForce(int[] numbers, int target){  // Normal loop approach
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main() {
        System.out.println(Arrays.toString(twoSumBruteForce(new int[]{2,7,11,15} , 9)));
        System.out.println(Arrays.toString(twoSumBetter(new int[]{2,7,11,15} , 9)));
        System.out.println(Arrays.toString(twoSumOptimal(new int[]{2,7,11,15}, 9)));
    }
}
