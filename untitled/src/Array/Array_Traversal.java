package Array;

import java.util.Arrays;

public class Array_Traversal {

    public static void reverseArray(int[] arr){
        int left =0; int right = arr.length-1;
        while (left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static boolean ispalindrome(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            if (arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean pairSum(int[] arr , int target){
        // array must be sorted
        Arrays.sort(arr);

        int left =0;
        int right = arr.length-1;
        while (left<right){
            int sum = arr[left] + arr[right];

            if (sum == target) return true;
            else if (sum<target) left++;
            else right--;
        }
        return false;

        // why sorted : - sorted will help to decide direction O(n) solution
    }

    public static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            if(arr[i]>max) max= arr[i];
        }
        return max;
    }

    public static int[] TwoSum1(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            int sum = arr[left] + arr[right];
            if (sum == target){
                return new int[]{left,right};
            }
            else if (sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new  int[]{-1,-1};
    }

    public static void main(String[] args) {
        // Traversal Basically means that to visit all elements in the array only once

        // syntax

        int[] arr = new int[]{10, 20, 30};

        // forward traversal
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i] +" ");
        }

        // pattern used i++;

        // arr = [10,20,30]

        // i  arr[i]

        // 0   10
        // 1   20
        // 2   30
        // end

        // time complexity = O(n);

        // use when printing the array , sum , max , min , frequency count , basic scanning

        // reverse traversal

        // traversing from last index to first index

        int[] arr1 = new int[]{5, 10, 15};

        for (int i=arr1.length-1; i>=0; i--){
            System.out.println(arr1[i] +" ");
        }

        // pattern used i--

        // time complexity = O(n)

        // use for reverse print , right side check , stack like logic

        // two pointer traversal IMP

        // use two pointers

        // left=start(0)
        // right=end(n-1)
        // both pointer will move

        // basic logic
//
//        int left = 0;
//        int right = arr1.length-1;
//        while (left < right){
//            // logic
//            left++;
//            right--;
//        }

        // eg:- reverse the array

        reverseArray(arr1);

        // time = O(n);
        // space = O(1);
        // is palindrome
        System.out.println(ispalindrome(arr1));

        System.out.println(pairSum(arr,20));

        // traversal = movement + logic;

        // maximun=Element

        System.out.println(maxElement(arr1));

        // two sum sorted array

        System.out.println(Arrays.toString(TwoSum1(arr , 50)));



    }
}
