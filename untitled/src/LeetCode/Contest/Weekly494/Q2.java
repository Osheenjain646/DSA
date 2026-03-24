package LeetCode.Contest.Weekly494;

public class Q2 {

    public static boolean uniformArray(int[] nums1){
        int smallestEven=Integer.MAX_VALUE;
        int smallestOdd=Integer.MAX_VALUE;
        for (int i=0; i<nums1.length; i++){
            if (nums1[i]%2==0){
                smallestEven=Math.min(smallestEven,nums1[i]);
            }else {
                smallestOdd=Math.min(smallestOdd,nums1[i]);
            }
        }
        if (smallestEven==Integer.MAX_VALUE||smallestOdd==Integer.MAX_VALUE){
            return true;
        }
        if ((smallestEven-smallestOdd)>0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){

    }
}
