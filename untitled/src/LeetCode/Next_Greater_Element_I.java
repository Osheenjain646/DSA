package LeetCode;

import java.util.Arrays;

public class Next_Greater_Element_I {

    public static int[] nextGreaterElementBetter(int[] nums1 , int[] nums2){
        int[] ans = new int[nums1.length];
        Arrays.fill(ans,-1);
        for (int i=0; i<nums1.length; i++){
            for (int j=0; j<nums2.length; j++){
                if (nums1[i]==nums2[j]){
                    for (int k=j+1; k<nums2.length; k++){
                        if (nums2[k]>nums2[j]){
                            ans[i]=nums2[k];
                            break;
                        }
                    }
                    break;  // skip the useless iteration
                }
            }
        }
        return ans;
    }

    public static int[] nextGreaterElementBruteForce(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Arrays.fill(ans,-1);
        for (int i=0; i<nums1.length; i++){
            for (int j=0; j<nums2.length; j++){
                if (nums1[i]==nums2[j]){
                    for (int k=j+1; k<nums2.length; k++){
                        if (nums2[k]>nums2[j]){
                            ans[i]=nums2[k];
                            break;
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main() {
        System.out.println(Arrays.toString(nextGreaterElementBruteForce(new int[]{4,1,2} , new int[] {1,3,4,2})));
        System.out.println(Arrays.toString(nextGreaterElementBetter(new int[]{4,1,2} , new int[] {1,3,4,2})));
    }
}
