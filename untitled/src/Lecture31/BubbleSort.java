package Lecture31;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static int[] bubbleSort(int[] nums){
        int n = nums.length;
        for (int i=0; i< n-1; i++){
            for (int j=0; j< n-1-i; j++){
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements in the array in unsorted manner to sort using the bubble sort: ");
        for (int i=0; i<nums.length; i++){
            System.out.print("Enter the element " + (i+1) + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Sorted Array using the bubble sort is as follows: ");
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }
}
