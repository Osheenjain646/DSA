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

    public static int subarraySum(int[] nums , int k){
        // first we create a hashmap to store the sum and frequency
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);   // base case handling , VERY IMPORTANT:- subarray starting from index 0

        int sum = 0;
        int count = 0;

        for (int num : nums){
            sum+=num;   // update the prefix sum

            if (map.containsKey(sum-k)){    // check if previous prefix exists or not
                count+=map.get(sum-k);  // add count of subarray
            }

            map.put(sum , map.getOrDefault(sum,0)+1);  // store current frequency
        }

        return count;  // return total subarrays
    }

    public static int equilibriumIndex(int[] nums){
        int total_sum=0;     // use to store the total sum then as rightSum to check with leftSum
        for (int num : nums){
            total_sum+=num;    // the total sum of all values
        }

        int leftSum=0;    // initial left sum
        for (int i=0; i<nums.length; i++){
            total_sum-=nums[i];   // total_sum becomes right sum now

            if (leftSum==total_sum) {  // means the left and right sum from current index excluding them are equal or not
                return i;  // returned current index
            }

            leftSum+=nums[i];   // update the leftSum now
        }

        return -1; // if there is no equilibrium index available
    }

    public static int longestSubArraySumK(int[] nums , int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        //  prefix sum -> first index

        int sum=0; int maxLen=0;

        for (int i=0; i<nums.length; i++){
            sum+=nums[i];    // cumulative sum

            if (sum==k){
                maxLen=i+1;      // if sum == k then maxLen = i+1 from 0 to i
            }

            if (!map.containsKey(sum)){
                map.put(sum,i);          // to store the first occurrence of the sum with index at which it appears
            }

            if (map.containsKey(sum-k)){   // if contain the previous prefix sum
                maxLen=Math.max(maxLen,i-map.get(sum-k));  // update the maxLen with the difference
                // between the distance from current index and index where the prefix sum is equal to the sum-k
            }
        }
        return maxLen;  // return the maxLen;
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
        // basically finding the subarray with sum == k

        // works by using the HashMap to check if the map contains the previousPrefix sum

        // Longest subarray with sum 0

        // the number of subarray exists
        int count=subarraySum(new int[]{1,2,3} , 3);
        // Dry Run
        // nums=[1,2,3] , k=3
        // sum=1 -> sum-k=-2
        // sum=3 -> sum-k=0  so count=1
        // sum=6 -> sum-k=3  so count=2
        // sum=10 -> sum-k=7 so count will not increase as 7 not exists

        System.out.println(count);

        // Equilibrium Index
        // The index i in the array where leftSum == rightSum

        int result = equilibriumIndex(new int[]{-7,1,5,2,-4,3,0});
        if (result==-1){
            System.out.println("No Equilibrium Index");
        }else {
            System.out.println("The Equilibrium Index is "+result);
        }

        // Longest Subarray Sum = k
        // works with negative numbers too
        int maxLen=longestSubArraySumK(new int[]{1,2,3,4,5,6,7,8,9,5,6,8,9,3,2,1,3,5,5,5,9} , 15);
        System.out.println(maxLen);

        // Prefix sum converts subarray problems into prefix differences,
        // enabling linear - time solutions even in presence of negative numbers
        // mistakes not to be make

        // forget to do map.put(0,1)
        // using the sliding window with negative values
        // Integer OverFlow -> use long if required
        // don't overwrite the index while storing the prefix sum



    }
}
