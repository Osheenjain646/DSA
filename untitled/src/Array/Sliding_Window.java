package Array;

import java.util.HashSet;

public class Sliding_Window {

    public static int longestUnique(int[] arr){
        // using hashset to track the elements in the current window to check for any duplicates in the future
        HashSet<Integer> set = new HashSet<>();

        int i=0; // left pointer to shrink the window
        int maxLen=0;  // initial length

        for (int j=0; j<arr.length; j++){

            while (set.contains(arr[j])){
                // if duplicate
                // then
                set.remove(arr[i]);  // remove element from the left
                // move the left
                i++;  // shrinking the window
            }

            set.add(arr[j]); // add new element
            maxLen=Math.max(maxLen,j-i+1); // update the maxLen
        }
        return maxLen;
    }

    public static int longestSubarraySumK(int[] arr , int k){
        // set pointer to get maxLen
        // using the fast slow like pointers here
        int i=0;  // left pointer
        int sum=0;  // current sum
        int maxLen=0;  // initial length

        for (int j=0; j<arr.length; j++){    // right pointer
            sum+=arr[j];   // calculating the sum and expanding the window size

            while (sum>k){  // shrink the window size until sum<=k
                sum-=arr[i++];  // removing the element pointed by left pointer in the left of the
                // variable window , move the left pointer
            }

            maxLen = Math.max(maxLen,j-i+1);  // update the maxLen ( remember +1 for including the elements both at i and j index )
        }
        return maxLen; // return the maxLen now
    }

    public  static int maxSumOfSubarray(int[] arr , int k){
        int windowSum=0;
        int maxSum=Integer.MIN_VALUE;  // initial max sum

        // first window
        for (int i=0; i<k; i++){
            windowSum+=arr[i];   // first k elements sum
        }

        maxSum=windowSum;    // initial maxSum value as first window sum

        // slide the window
        for (int i=k; i<arr.length; i++){
            windowSum+=arr[i];   // add new element
            windowSum-=arr[i-k];  // remove old element from the left
            maxSum=Math.max(maxSum,windowSum);   // update the maxSum
        }
        return maxSum;
        // O(n) time and O(1) space
    }

    public static int countSubarrays(int[] arr , int k , int s){
        int count=0;     // no of subarray
        int windowSum=0;  // current window sum

        // first window sum
        for (int i=0; i<k; i++){
            windowSum+=arr[i];   // first k elements
        }

        if(windowSum>=s){    // check first windows sum
            count++;
        }

        // slide the window for else elements

        for (int i=k; i<arr.length; i++){
            windowSum+=arr[i];    // add new
            windowSum-=arr[i-k];  // remove old
            if (windowSum>=s){    // check the current window sum
                count++;
            }
        }

        return count;
        // O(n) time O(1) space
    }

    static void main() {
        // 50% subarray problem will be clear with this
        // window is the continuous subarray in an array
        // it will slide without re-computing everything

        // 1)
        // used to solve the array and string problem easily avoiding the repeated work
        // with sliding window each element is added and removed once which save the time
        // to recompute the result of every subarray which helps to go from O(n^2) to O(n)

        // 2)
        // instead of recomputing window from scratch:-
        // we do, remove element going out and add the incoming element

        // if window size is k then sum of [i  to i+k-1] -> next window [i+1 to i+k]
        // only two operation instead of k
        // 3)
        // space efficient usually O(1) or small map or array for frequency

        //4)
        // IMP
        // used when asked for subarrays substrings continuous segments
        // with keywords like longest shortest subarray substring and at most / at least k
        // have fixed and                          variable sliding window
        // max size of size k                      the longest substring without repeating characters
        // average of subarrays of size k          minimum window substring

        // 5)
        // use one loop in place of nested loops and clear pointer movement like left and right pointer
        // easier to debug and explain

        // 6)
        // easily scales for large inputs

        // 7)
        // do not work for when the subarray is not contiguous
        // when you don't know when to expand or shrink your window
        // do not use for small inputs give unnecessary complexity
        // can't be used to get the past windows use prefix sum instead


        // TYPE:-

        // 1)

        // Fixed Window
        // Rule
        // window size is constant (k) always
        // like given as size k / exact k then use fixed window

        // problem 1

        // Max Sum Subarray of size K

        // if we think in brute we will calculate the sum of every subarray and find the max from it
        // this will take O(n*k) time for finding each subarray and their sum too

        // so we use sliding window in which we find first window of size k and store their sum as maxsum,
        // and then we move one by one to add next element (slide the window) in the window at end and remove its 1st element and
        // calculate the new sum and check for the max from currentWindowSum and maxsum


        int[] arr = {2,1,5,1,3,2};
        int windowSize = 3;
        int maxSum=maxSumOfSubarray(arr,windowSize);
        System.out.println(maxSum);

        // Problem 2

        // Count subarrays of size k with sum >=S

        int count=countSubarrays(new int[]{2,1,5,1,3,2,1,5,8,9,6,3,4,5,1} , 3 , 15);
        System.out.println(count);

        // 2)

        // Variable Sliding Window
        // rule
        // window expands + shrink both
        // must use for finding the longest/shortest subarray
        // variable sliding window don't work with negative values

        // problem 3:- Longest subarray with Sum<=k

        // Intuition:-
        // Right pointer -> use to expand the window size
        // if sum exceed the k -> left pointer will shrink the window
        // only applicable for positive numbers only

        int maxLen=longestSubarraySumK(arr,10);
        System.out.println(maxLen);

        // problem 4:- Longest Unique Subarray
        // This problem means that Subarray will contain only the unique elements
        // it means there must be no duplicates in the subarray
        // So we use the HashSet here to get only unique elements

        int[] arr1 = {2,5,4,5,3,3,1,2,6,4,5,8,9,7,10,11,1};
        int maxLen_Longest_Unique=longestUnique(arr1);
        System.out.println(maxLen_Longest_Unique);

        // conclusion:-
        // exact size k->fixed sliding window
        // longest/shortest subarray->variable sliding window
        // for negative values->sliding window fails (variable) -> use prefix sum + hashmap



    }
}
