package Lecture33;

public class Nth_Magic_Square {

    public static int solve(int n){
        int value =0;
        int p =5;
        while (n>0){
            if((n&1)==1){
                value+=p;
            }
            p*=5;
            n=n>>1;
        }
        return value;
    }

    public static void main(String[] args){
        System.out.println(solve(10));
    }
}
