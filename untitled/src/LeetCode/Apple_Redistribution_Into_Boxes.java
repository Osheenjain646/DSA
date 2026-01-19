package LeetCode;

import java.util.*;

public class Apple_Redistribution_Into_Boxes {

    public static int minimumBoxesOptimal(int[] apple, int[] capacity) {
        int sum=0;
        for(int a:apple){
            sum+=a;
        }

        //Arrays.sort(capacity);

        for(int i=0; i<capacity.length; i++){
            for(int j=0; j<capacity.length-i-1; j++){
                if(capacity[j] > capacity[j+1]){
                    int temp=capacity[j];
                    capacity[j]=capacity[j+1];
                    capacity[j+1]=temp;
                }
            }
        }
        int boxes=0;
        for (int i=capacity.length-1;i>=0 && sum>0;i--){
            sum-=capacity[i];
            boxes++;
        }
        return boxes;
    }

    public static int minimumBoxesBetter(int[] apple, int[] capacity) {
        int sum=0;
        for(int a:apple){
            sum+=a;
        }

        Arrays.sort(capacity);
        int boxes=0;
        for (int i=capacity.length-1;i>=0 && sum>0;i--){
            sum-=capacity[i];
            boxes++;
        }
        return boxes;
    }

    public static int minimumBoxesBruteForce(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=0;
        int boxes=1;
        for(int i=0; i<apple.length; i++){
            sum+=apple[i];
        }

        for(int i=capacity.length-1; i>=0 && sum!=0; i--){
            if(capacity[i]>=sum){
                return boxes;
            }
            else{
                sum-=capacity[i];
                boxes++;
            }
        }
        return boxes;
    }

    public static void main(String[] args) {
        System.out.println(minimumBoxesBruteForce(new int[]{1,3,2} , new int[] {4,3,1,5,2}));
        System.out.println(minimumBoxesBetter(new int[]{1,3,2} , new int[] {4,3,1,5,2}));
        System.out.println(minimumBoxesOptimal(new int[]{1,3,2} , new int[] {4,3,1,5,2}));
        System.out.println(minimumBoxesBruteForce(new int[]{5,5,5}, new int[] {2,4,2,7}));
        System.out.println(minimumBoxesBetter(new int[]{5,5,5}, new int[] {2,4,2,7}));
        System.out.println(minimumBoxesOptimal(new int[]{5,5,5}, new int[] {2,4,2,7}));
    }
}
