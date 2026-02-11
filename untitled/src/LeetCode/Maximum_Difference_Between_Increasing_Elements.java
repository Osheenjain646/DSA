package LeetCode;

public class Maximum_Difference_Between_Increasing_Elements {

    public static int maximumDifferenceOptimal(int[] nums){
        int maxDifference=-1;
        int minValue=nums[0];
        for (int i=1; i<nums.length; i++){
            if (nums[i]>minValue){
                maxDifference=Math.max(maxDifference , (nums[i]-minValue));
            }
            minValue=Math.min(minValue , nums[i]);
        }
        return maxDifference;
    }

    public static int maximumDifferenceBetter(int[] nums){
        int maxDifference=-1;
        int minValue=nums[0];
        for (int i=1; i<nums.length; i++){
            maxDifference=Math.max(maxDifference , (nums[i]-minValue));
            minValue=Math.min(minValue , nums[i]);
        }
        return maxDifference==0?-1:maxDifference;
    }

    public static int maximumDifferenceBruteForce(int[] nums){
        int max=-1;  // return -1 if not found max
        int n =nums.length;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                max=Math.max(max , nums[j]-nums[i]);  // die for duplicate value it will give 0
            }
        }
        return max==0?-1:max;
    }

    public static void main (String[] args){

    }
}
