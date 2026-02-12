package LeetCode.BinarySearch;

public class Find_First_And_Last_Position_Of_Element_In_Sorted_Array {

    public static int[] searchRangeBetter(int[] nums , int target){
        return new int[]{};
    }

    public static int[] searchRangeBruteForce(int[] nums , int target){
        int first=-1;
        int last=-1;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==target){
                first=i;
                break;
            }
        }
        for (int j=nums.length-1; j>=0; j--){
            if (nums[j]==target){
                last=j;
                break;
            }
        }
        return new int[]{first,last};
    }

    public static void main(String[] args){

    }
}
