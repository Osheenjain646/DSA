package Lecture36;

// recursive way

public class Factorial_Of_N {

    public static int FactorialOfN(int n){
        if (n==0){
            return 1;
        }

        return n* FactorialOfN(n-1);
    }

    public static void main(String[] args){
        System.out.println(FactorialOfN(5));
    }
}
