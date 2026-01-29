package Array;
import java.util.*;
public class Prefix_Sum {

    public static int[] buildPrefix(int[] arr){
        int[] prefix = new int[arr.length];  // build prefix array first
        prefix[0] = arr[0];   // The 0th element's prefix sum will be always equal to itself

        for (int i=1; i<arr.length; i++){
            prefix[i]=prefix[i-1]+arr[i];   // cumulative sum
        }

        return prefix;  // return the prefix array
    }

    public static int rangeSum(int[] prefix , int left , int right){
        if(left==0){
            return prefix[right];  // if left is 0 index the return the prefix at right as it is true.
        }
        return prefix[right]-prefix[left-1];  // otherwise subtract the prefix sum before the left from the right.
    }

    static void main() {
        // It id the backbone of the subarray problems
        // When sliding window fails for the negative value
        // Prefix Sum comes as a Hero here for the solution of it

        // what is prefix sum
        // first create a prefix sum container array
        // To calculate the sum of all the elements before the current and itself
        // and store it in the current element index of the new prefix array from 0th index till the current.
        // eg:- pref[i] = arr[0] +arr[1] + ... + arr[i]
        // The cumulative sum till i from 0 will be stored in the i of prefix array

        // Problem 1:-
        // Building a simple prefix array

        System.out.println(Arrays.toString(buildPrefix(new int[]{1,2,3,4,5,6,7,8,9})));
        // Time:- O(n) , Space:- O(n)

        // Problem 2:-
        // Range Sum Queries (very common)
        // Query:- Sum from index left to right

        // Formula:- Sum(l,r) = prefix[r]-prefix[l-1] if(l!=0)
        //           Sum(l,r) = prefix[r] if(l==0)

        System.out.println(rangeSum(new int[]{1,3,6,10,15,21,28,36,45} , 0 ,6));
        System.out.println(rangeSum(new int[]{1,3,6,10,15,21,28,36,45} , 5 ,8));
        System.out.println(rangeSum(new int[]{1,3,6,10,15,21,28,36,45} , 2 ,7));

        // if we preprocess the prefix sum then O(n) time
        // and for each query O(1)

        // Problem 3:-
        // Prefix Sum + HashMap (The Game Changer)

        // when to use:-
        // Subarray problems
        // Negative numbers present
        // count / existence / longest type

        // Problem 1:- Subarray sum = k
        // (works with even negative numbers)
        // core idea:-   currentPrefix - previousPrefix = K
        //  => also used as currentPrefix - K = previousPrefix
        // beech ka subarray ka sum = K

        // works by using the HashMap to check if the map contains the previousPrefix sum

        // Longest subarray with sum 0



    }
}
