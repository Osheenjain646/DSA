package LeetCode;

public class Search_Insert_Position {

    public static int searchInsert(int[] nums, int target) {
        int end=nums.length-1;
        int start=0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
    }
}
