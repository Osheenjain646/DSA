package LeetCode;

public class Reverse_Integer {

     public static int reverseInteger(int x) {
         long ans=0;
         while(x!=0){
             ans=ans*10+x%10;
             x=x/10;
         }
         return (ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)?0:(int) ans;
     }

    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
        System.out.println(reverseInteger(120));
        System.out.println(reverseInteger(-123));
    }
}
