package LeetCode;

public class Sqrt {

    public static int sqrtUsingBinarySearch(int x){
        int low=0,high=x;
        int ans =0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if (mid==x/mid){
                return (int)mid;
            }
            else if (mid>x/mid){
                high = mid-1;
            }
            else {
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }

    public static int sqrtNotGood(int x) {
        return (int)Math.sqrt(x);
    }

    public static void main(String[] args) {
        System.out.println(sqrtNotGood(4));
        System.out.println(sqrtNotGood(8));
        System.out.println(sqrtUsingBinarySearch(4));
        System.out.println(sqrtUsingBinarySearch(8));
    }
}
