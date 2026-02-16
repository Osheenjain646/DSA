package LeetCode.BinarySearch;

public class Sqrt {

    public static int sqrtOptimal(int x){
        // using the binary search
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

    public static int sqrtBetter(int x){
        // Using linear search
        if (x==0)return 0;

        int i=1;
        while ((long) i*i<=x){
            i++;
        }
        return i-1;
    }

    public static int sqrtBruteForce(int x) {
        return (int)Math.sqrt(x);
    }

    public static void main(String[] args) {
        System.out.println(sqrtBruteForce(4));
        System.out.println(sqrtBruteForce(8));
        System.out.println(sqrtBetter(4));
        System.out.println(sqrtBetter(8));
        System.out.println(sqrtOptimal(4));
        System.out.println(sqrtOptimal(8));
    }
}
