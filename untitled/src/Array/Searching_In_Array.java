package Array;

import java.util.Arrays;

public class Searching_In_Array {

    public static int linearSearch(int[] arr, int target){
        for (int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return i;//the first occurrence of the element in the array
            }
        }
        return -1;
    }

    public static int FirstOccurrenceLinear(int[] arr , int target){
        for (int i=0; i<arr.length; i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static int LastOccurrenceLinear(int[] arr , int target){
        for (int i=arr.length-1; i>=0; i--){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] arr , int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid = left+(right-left)/2; // doing this to prevent from getting overflow

            if (arr[mid]==target){
                return mid;
            }
            else if (arr[mid]<target){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return -1;
    }

    public static int FirstOccurrenceBinary(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int ans=-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (arr[mid]==target){
                ans=mid;
                right=mid-1;  // search on the left side for the first occurrence
            }
            else if (arr[mid]<target){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return ans;
    }

    public static int LastOccurrenceBinary(int[] arr, int target){
        int left =0;
        int right = arr.length-1;
        int ans = -1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (arr[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if (arr[mid]<target){
                left=mid+1;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static int lowerBound(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        int ans = arr.length;

        while (left<right){
            int mid = left+(right-left)/2;

            if (arr[mid]>=target){
                ans = mid;
                right=mid;
            }
            else {
                left=mid+1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        int ans = arr.length;
        while (left<right){
            int mid = left+(right-left)/2;
            if (arr[mid]>target){
                ans=mid;
                right=mid;
            }
            else {
                left=mid+1;
            }
        }
        return ans;
    }

    public static int sqrt(int x){
        int low = 0;
        int high = x;
        int ans = 0;
        while (low<=high) {
            int mid = low + (high - low) / 2;
            if (mid == x/mid) {
                return mid;
            } else if (mid < x/mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Linear Search

        // checking every element in the array from start to end

        int[] arr = new int[]{1,2,3,10,5,8,4,5,6,7,1,3,2,8,9,10};

        int result = linearSearch(arr,7); // this will provide the first occurrence of the element in the array (index)

        if (result!=-1){
            System.out.println("Element found at index: " + result);
        }else {
            System.out.println("Element not found");
        }
        // O(1) for best else O(n) worst at last
        // array unsorted ho
        // input size must be small
        // simplicity>performance

        // Occurrence(Linear)
        System.out.println(FirstOccurrenceLinear(arr,8));
        System.out.println(LastOccurrenceLinear(arr,10));

        // BinarySearch
        // Mandatory condition : Array must be sorted;
        Arrays.sort(arr);
        System.out.println(BinarySearch(arr,8));
        // for sorting the array in the array n log n and binary search is log n

        // Occurrence(Binary) // uses for search space
        System.out.println(FirstOccurrenceBinary(arr,8));
        System.out.println(LastOccurrenceBinary(arr,8));

        // lower bound and upper bound (google friendly)
        // lower bound is index where the value>=target
        /*
        Applicable only on sorted array

        low → start of search space (inclusive)

        high → end of search space (exclusive)

        Search range is [low, high)

        Default answer if no valid position is found

        Means: key should be placed at the end

        Continue while search space is valid

        When low == high, the exact position is found where it can be inserted also used for it

        */

        System.out.println(lowerBound(arr,8));

        // UpperBound is the index where the value>target
        System.out.println(upperBound(arr,8));

        // Advanced Pattern
        // not searching for the element here but doing answer space search;
        // finding the sqrt using the binary search

        System.out.println(sqrt(625));

    }
}
