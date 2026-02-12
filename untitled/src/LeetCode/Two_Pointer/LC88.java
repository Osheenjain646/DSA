package LeetCode.Two_Pointer;

import java.util.Arrays;

public class LC88 {

    public static void mergeBetter(int[] nums1 , int m , int[] nums2 , int n){
        int i=m-1;
        int j=n-1;
        int k=nums1.length-1;
        while(i>=0&&j>=0){
            if(nums1[i]<nums2[j]){
                nums1[k--]=nums2[j];
                j--;
            }
            else{
                nums1[k--]=nums1[i];
                i--;
            }
        }
        while (j>=0){
            nums1[k--]=nums2[j--];
        }
    }

    public static void mergeBruteForce(int[] nums1 , int m , int[] nums2 , int n){
        int i=m;
        int j=0;
        while (i<nums1.length && j<n){
            nums1[i++]=nums2[j++];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args){

    }
}
