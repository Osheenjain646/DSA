package LeetCode.BinarySearch;

public class LC367 {

    public static boolean isPerfectSquareBetter(int num){
        int left =1;
        int right=num;
        while (left<right){
            int mid=left+(right-left)/2;
            if ((long)mid*mid==num){
                return true;
            }else if ((long)mid*mid>num){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return false;
    }

    public static boolean isPerfectSquareBruteForce(int num){
        for (int i=1; i<=num; i++){
            if (i==num/i){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

    }
}
