package LeetCode.Contest.Weekly487;

public class Q1 {

    public static int countMonoBbitBruteForce(int n) {
        if (n==0) return 1;
        int count=1;
        int power=1;
        while ((Math.pow(2,power)-1)<=n){
            count++;
            power++;
        }
        return count;
    }

    static void main() {
        // Count MonoBit Integers
    }
}
