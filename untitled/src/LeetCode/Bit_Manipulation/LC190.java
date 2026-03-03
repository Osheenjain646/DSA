package LeetCode.Bit_Manipulation;

public class LC190 {

    public static int Optimal(int n){
        int res=0;
        for (int i=0; i<32; i++){
            if ((n&(1<<i))!=0){
                res|=(1<<(31-i));
            }
        }
        return res;
    }

    public static int Better(int n){
        int res=0;
        for (int i=31; i>=0; i--){
            if ((n&1)==1){
                res|=(1<<i);
            }
            n=n>>1;
        }
        return res;
    }

    public static int BruteForce(int n){
        StringBuilder binaryNumber = new StringBuilder();
        for (int i=0; i<32; i++){
            if ((n&(1<<i))!=0){
                binaryNumber.append("1");
            }else {
                binaryNumber.append("0");
            }
        }

        String reverseBinaryNumber = binaryNumber.reverse().toString();
        int result =0;
        for (int i=0; i<32; i++){
            if (reverseBinaryNumber.charAt(i)=='1'){
                result|=(1<<i);
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(BruteForce(43261596));
        System.out.println(BruteForce(2147483644));
        System.out.println(Better(43261596));
        System.out.println(Better(2147483644));
        System.out.println(Optimal(43261596));
        System.out.println(Optimal(2147483644));
    }
}
