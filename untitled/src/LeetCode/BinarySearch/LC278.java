package LeetCode.BinarySearch;

public class LC278 {
    public static int firstBadVersionBruteForce(int n){
        for(int i=1; i<=n; i++){
            if(/*isBadVersion*/(i)==1){
                return i;
            }
        }
        return -1;
    }

    public static int firstBadVersionBetter(int n){
        // using the binary search
        int left=1;
        int right=n;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (/*isBadVersion*/(mid)==1){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return left; // or right both will be standing at the same position at end
    }

    public static int firstBadVersionOptimal(int n){
        // using the lower bound to find the first occurrence of the bad version
        int left =1;
        int right=n;
        while (left<right){
            int mid = left+(right-left)/2;
            if(/*isBadVersion*/(mid)==1){
                right=mid;
            }else {
                left=mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args){

    }
}
