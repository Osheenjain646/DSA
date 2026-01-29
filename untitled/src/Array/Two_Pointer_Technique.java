package Array;

import java.util.Arrays;

public class Two_Pointer_Technique {

    public static void swap(int[] arr, int val1 , int val2){
        int temp=arr[val1];
        arr[val1]=arr[val2];
        arr[val2]=temp;
    }


    public static int[] sort012(int[] arr){
        int low=0 , mid=0 , end=arr.length-1;
        while (mid<=end){
            if (arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            } else if(arr[mid]==1){
                mid++;
            }
            else {
                swap(arr,mid,end);
                end--;
            }
        }
        return arr;
    }

    public static int[] removeDuplicates(int[] arr){
        Arrays.sort(arr);
        int slow=1;
        for (int fast=1; fast<arr.length; fast++){
            if (arr[fast]!=arr[slow-1]){
                arr[slow++]=arr[fast];
            }
        }
        return Arrays.copyOf(arr,slow);
    }

    public static int[] moveZeros(int[] arr){
        int slow=0;

        // taking non-zero to forward position
        for (int fast=0; fast<arr.length; fast++){
            if (arr[fast]!=0){
                arr[slow++]=arr[fast];
            }
        }

        // now fill leftover array with zeros
        while (slow<arr.length){
            arr[slow++]=0;
        }
        return arr;
    }

    public static boolean pairSum(int[] arr , int target){
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int sum = arr[left]+arr[right];
            if (sum==target)
                return true;
            else if (sum<target)
                left++;
            else right--;
        }
        return false;
    }

    static void main(){
        // We use two or more pointers in array for controlled movement
        // so we can make O(n^2) to O(n) complexity

        // use for smart array traversal
        // when in-place solution is required
        // to avoid extra space usage

        // Pattern 1: Left-Right Pointer
        // when to use :-
        // Basically when have work from both the ends of the array

        // eg:-  reversing , palindrome , pair sum(sorted)

        // basic template (blueprint)

        // int l=0 , r = arr.length-1;
        // while(l<r){
        //  // logic
        //  l++;
        //  r--;
        // }

        int[] arr = {1,2,3,4,6,8,9,3,5,6,5,1,2,7,8,9};

        // reverse array

        int left=0 , right=arr.length-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
        //Time:- O(n)
        //Space:- O(1) (in-place)

        // Pair Sum
        // Array must be sorted
        // used to find a targeted sum of addition of two values in the array
        int target = 18;
        Arrays.sort(arr);
        System.out.println(pairSum(arr,target));
        // O(n^2) to O(n)
        // sorted is required so that pointer has some meaning
        // using two pointer will help to avoid redundant pair checks
        // and iterating over the array only once which reduce complexity to O(n+n)==O(n)

        // Pattern 2:- Fast-Slow Pointer
        // use to remove or filter the problems
        // when to maintain the order
        // for In-Place Modification

        // Basic Template
        // int slow=0;
        // for(int fast=0; fast<arr.length; fast++;){
        //   if(condition){
        //       arr[slow]=arr[fast];
        //       slow++;
        //   }
        // }

        //eg:- Move zeros to end

        int[] arr1 = {0,4,5,0,8,6,0,5,4,6,7,3,0};
        System.out.println(Arrays.toString(moveZeros(arr1)));
        // returning the array with moving all the zeros to left and maintain the order of all other elements
        //Time:- O(n)
        // Space:- O(1)

        // Remove Duplicates(sorted array is required)
        // sorted is required to check adjacent elements precisely
        // This is used to get count of unique elements in the array
        // and modify the array containing unique elements as first k elements

        System.out.println(Arrays.toString(removeDuplicates(arr1)));

        // Three Pointers (Dutch National Flag)
        // use to sort three type of elements (0s , 1s , 2s)
        // idea low -> 0 , mid -> 1 , high -> 2
        // assigned as low=0 , mid=0 , high=arr.length-1(end);
        // sort012 in the array
        // Using Binary search style
        int[] arr2={0,2,1,0,2,1,0,2,0,1,1,0,2};
        System.out.println(Arrays.toString(sort012(arr2)));

        // related to sort colors in the leet code


    }
}
