package LeetCode.Bit_Manipulation;

public class NumberRaiseToPowerN {

    public static int power(int number , int power){
        int ans=1;
        int a=number;
        while (power>0){
            int lastBit=power&1;
            if (lastBit==1){
                ans=ans*a;
            }
            power=power>>1;
            a=a*a;
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(power(2,10));
        System.out.println(power(5,8));
    }
}
