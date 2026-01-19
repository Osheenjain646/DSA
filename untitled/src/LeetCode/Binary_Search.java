package LeetCode;

public class Binary_Search {

    public static int  search(int[] nums, int target) {
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
        System.out.println(search(new int[]{-1,0,3,5,9,12} , 9));
        System.out.println(search(new int[]{-1,0,3,5,9,12} , 2));

    }
}
