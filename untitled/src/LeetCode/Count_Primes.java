package LeetCode;

import java.util.Arrays;

public class Count_Primes {

    public static int countPrimesOptimal(int n){    // using sieve of Eratosthenes
        // This will save the unnecessary checks
        if(n<2){
            return 0;
        }
        boolean[] b= new boolean[n];
        Arrays.fill(b,true);
        b[0]=false;
        b[1]=false;
        for(int i =2; i*i<n; i++){
            if(b[i]){
                for(int j =i*i; j<n; j+=i){
                    b[j]=false;
                }
            }
        }
        int count=0;
        for(boolean val : b){
            if (val){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrimeBetter(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int countPrimesBetter(int n) {
        if (n < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimeBetter(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrimeBrute(int n){
        for(int i=2; i<n; i++){  // This will give and tle as of double for loop
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int countPrimesBruteForce(int n) {
        if (n < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimeBrute(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimesBruteForce(10));
        System.out.println(countPrimesBetter(10));
        System.out.println(countPrimesOptimal(10));
    }
}
