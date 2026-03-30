package Lecture36;

public class Print_1_To_N {

    public static void PrintDec(int n){
        if (n==0){
            return;
        }

        System.out.println(n);
        PrintDec(n-1);
    }

    public static void PrintInc(int n){

        // base condition
        if (n==0){
            return;
        }

        PrintInc(n-1);  // recursive call for n-1 value
        System.out.println(n);  // solve for current the val when base condition return
    }

    public static void main(String[] args){
        PrintInc(10);
        PrintDec(10);
    }
}
