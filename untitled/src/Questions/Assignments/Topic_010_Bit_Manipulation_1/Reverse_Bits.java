package Questions.Assignments.Topic_010_Bit_Manipulation_1;

public class Reverse_Bits {

    public static int reverseBitsOptimal(int n){
        int res =0;
        for (int i=0; i<32; i++){
            if ((n&(1<<i))!=0){
                res|=(1<<(31-i));
            }
        }
        return res;
    }

    public static int reverseBitsBetter(int n){
        int num=0;
        for (int i=31; i>=0; i--){
            if ((n&1)==1){
                num+=1<<i;
            }
            n=n>>1;
        }
        return num;
    }

    public static int reverseBitsBruteForce(int n){
        StringBuilder binaryNumber = new StringBuilder();
        for (int i=0; i<32; i++){
            if ((n&(1<<i))!=0){
                binaryNumber.append("1");
            }else {
                binaryNumber.append("0");
            }
        }

        int res =0;
        String reversedNumber = binaryNumber.reverse().toString();
        for (int i=0; i<32; i++){
            if (reversedNumber.charAt(i)=='1'){
                res|=(1<<i);
            }
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(reverseBitsBruteForce(43261596));
        System.out.println(reverseBitsBruteForce(2147483644));
        System.out.println(reverseBitsBetter(43261596));
        System.out.println(reverseBitsBetter(2147483644));
        System.out.println(reverseBitsOptimal(43261596));
        System.out.println(reverseBitsOptimal(2147483644));
    }
}
