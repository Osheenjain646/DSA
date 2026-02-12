package LeetCode;

public class Factorial_Trailing_Zeros {

    public static int trailingZeroesOptimal(int n){
        // Using the prime factorization
        // means that number ko prime numbers ke product main break krna
        // when you get 2*5 there will be one zero
        // as 5 have less multiples in the range then the 5 so use 5
        // so instead of calculating we will count the number of 5's
        // general formula is n/5+n/25 means increasing the power of 5
        int count=0;
        while (n>0){
            n/=5;
            count+=n;
        }
        return count;
    }

    public static int trailingZeroesBruteForce(int n){
        // calculate the factorial first
        // Cannot be done using the long type
        long fact=1;
        for (int i=1; i<=n; i++){
            fact*=i;
        }

        int zeroes=0;
        // calculating the zeroes
        while (fact>0){
            if (fact%10!=0){
                break;
            }
            zeroes++;
            fact/=10;
        }
        return zeroes;
    }

    public static void main(String[] args){

    }
}
