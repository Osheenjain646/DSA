package LeetCode;

public class Binary_Search {

    public static int recursiveHelper(int [] nums, int target , int left , int right){
        if(left>right){
            return -1;
        }

        int mid=left+(right-left)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            return recursiveHelper(nums , target , left , mid-1);
        }
        else {
            return recursiveHelper(nums , target ,mid+1 , right);
        }
    }

    public static int searchRecursive(int[] nums, int target){
        return recursiveHelper(nums , target , 0 , nums.length-1);
    }

    public static int  searchNormal(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    static void main() {
        System.out.println(searchNormal(new int[]{-1,0,3,5,9,12} , 9));
        System.out.println(searchNormal(new int[]{-1,0,3,5,9,12} , 2));
        System.out.println(searchRecursive(new int[]{-1,0,3,5,9,12} , 9));
        System.out.println(searchRecursive(new int[]{-1,0,3,5,9,12} , 2));

    }
}
