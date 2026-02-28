package LeetCode.Bit_Manipulation;

public class LC191 {

    public static int hammingWeightOptimal(int n){
        // using brian kernighan algo
        // trick n & (n-1)
        // and store back to n
        // this algo will remove the last set bit from the right of the binary
        int count = 0 ;
        while(n>0){
            n = ( n & ( n - 1 ) );
            count++;
        }
        return count;
    }

    public static int hammingWeightBetter2(int n){
        int count =0;
        for (int i=0; i<32; i++){
            if ((n&(1<<i))!=0){
                // checking with !=0 as if somewhere a bit got matched then the output value will not be 0
                // otherwise all bits will make each other as 0 and output will be always 0
                // that's why checking with !=0 here
                count++;
            }
        }
        return count;
    }

    public static int hammingWeightBetter1(int n){
        int count =0;
        while(n>0){
            // doing bitwise and with 1 as it will give 1 if last bit is set or 1 otherwise it will give 0

            if ((n&1)==1){
                count++;
            }
            // right shift
            n=n>>1;
        }
        return count;
    }

    public static int hammingWeightBruteForce(int n){
        int count =0;
        while (n>0){
            int modulo = n%2;
            if (modulo==1){
                count++;
            }
            n/=2;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(hammingWeightBruteForce(11));
        System.out.println(hammingWeightBruteForce(128));
        System.out.println(hammingWeightBruteForce(2147483645));
        System.out.println(hammingWeightBetter1(11));
        System.out.println(hammingWeightBetter1(128));
        System.out.println(hammingWeightBetter1(2147483645));
        System.out.println(hammingWeightBetter2(11));
        System.out.println(hammingWeightBetter2(128));
        System.out.println(hammingWeightBetter2(2147483645));
        System.out.println(hammingWeightOptimal(11));
        System.out.println(hammingWeightOptimal(128));
        System.out.println(hammingWeightOptimal(2147483645));
    }
}
