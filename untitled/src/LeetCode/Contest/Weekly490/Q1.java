package LeetCode.Contest.Weekly490;

public class Q1 {
    // Find the Score Difference in a Game

    public static int scoreDifference(int[] nums){
        int firstPlayerScore = 0;
        int secondPlayerScore = 0;
        boolean first = true;
        boolean second = false;
        int gameCount = 1;
        for (int i=0; i<nums.length; i++){
            if (gameCount%6==0){
                first = !first;
                second = !second;
            }
            if (nums[i]%2==1){
                first = !first;
                second = !second;
            }
            if (first){
                firstPlayerScore+=nums[i];
            }
            if (second){
                secondPlayerScore+=nums[i];
            }
            gameCount++;
        }
        return (firstPlayerScore - secondPlayerScore);
    }

    public  static void main(String[] args){
        System.out.println(scoreDifference(new int[]{1,2,3}));
        System.out.println(scoreDifference(new int[]{2,4,2,1,2,1}));
        System.out.println(scoreDifference(new int[]{1}));
    }
}
