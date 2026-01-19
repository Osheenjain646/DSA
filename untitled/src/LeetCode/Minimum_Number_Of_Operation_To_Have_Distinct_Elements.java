/*
You are given an integer array nums.

In one operation, you remove the first three elements of the current array. If there are fewer than three elements remaining, all remaining elements are removed.

Repeat this operation until the array is empty or contains no duplicate values.

Return an integer denoting the number of operations required.



Example 1:

Input: nums = [3,8,3,6,5,8]

Output: 1

Explanation:

In the first operation, we remove the first three elements. The remaining elements [6, 5, 8] are all distinct, so we stop. Only one operation is needed.

Example 2:

Input: nums = [2,2]

Output: 1

Explanation:

After one operation, the array becomes empty, which meets the stopping condition.

Example 3:

Input: nums = [4,3,5,1,2]

Output: 0

Explanation:

All elements in the array are distinct, therefore no operations are needed.



Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 105
*/
package LeetCode;

import java.util.HashSet;

public class Minimum_Number_Of_Operation_To_Have_Distinct_Elements {

    public static int minoperations(int[] nums){
        HashSet <Integer> set = new HashSet<>();
        int n = nums.length, op=0;
        for (int i=n-1; i>=0; i--){
            if (set.contains(nums[i])){
                if (((i+1)%3)==0){
                    op = ((i+1)/3);
                }
                else {
                    op = ((i+1)/3)+1;
                }
                break;
            }
            else {
                set.add(nums[i]);
            }
        }
        return op;
    }

    public static void main(String[] args) {
        int[] arr = {3,8,3,6,5,8};
        System.out.println(minoperations(arr));
    }
}
