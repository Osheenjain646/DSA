package LeetCode;

public class LC485 {

    public static int findMaxConsecutiveOnesBetter(int[] nums){
        int maxCount=0;
        int count=0;
        for (int i=0; i< nums.length; i++){
            if (nums[i]!=1){
                count=0;
            }else {
                count++;
            }
            maxCount=Math.max(maxCount , count);
        }
        return maxCount;
    }

    public static int findMaxConsecutiveOnesBruteForce(int[] nums){
        int maxCount =0;
        for (int i=0; i< nums.length; i++){
            int count=0;
            for (int j=i; j< nums.length; j++){
                if (nums[j]==1){
                    count++;
                }
                else {
                    break;
                }
            }
            maxCount=Math.max(maxCount , count);
        }
        return maxCount;
    }
    public static void main(String[] args){

    }
}
