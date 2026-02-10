package LeetCode.BinarySearch;

public class Search_Insert_Position {

    public static int searchInsertBruteForce(int[] nums , int target){
        for (int i =0; i<nums.length; i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    public static int searchInsertOptimised(int[] nums  , int target){
        // Using the lower bound condition
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;

    }

    public static int searchInsertBetter(int[] nums, int target) {   // optimised
        int end=nums.length-1;
        int start=0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(searchInsertBetter(new int[]{1,3,5,6}, 5));
        System.out.println(searchInsertBetter(new int[]{1,3,5,6}, 2));
        System.out.println(searchInsertBetter(new int[] {1,3,5,6},7));
        System.out.println(searchInsertBruteForce(new int[]{1,3,5,6}, 2));
        System.out.println(searchInsertBruteForce(new int[]{1,3,5,6}, 5));
        System.out.println(searchInsertBruteForce(new int[] {1,3,5,6},7));
    }
}
