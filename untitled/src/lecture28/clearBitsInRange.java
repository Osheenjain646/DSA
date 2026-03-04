package lecture28;

public class clearBitsInRange {

    public static int Better(int n , int i , int j){
        int leftMask = (-1<<(j+1));
        int rightMask = (1<<i)-1;
        int Mask = leftMask | rightMask;
        n = n & Mask;
        return n;
    }

    public static int Brute(int n , int i , int j){
        for (int k=i; k<=j; k++){
            n = n & ~(1<<k);
        }
        return n;
    }

    public static void main(String[] args){
        System.out.println(Brute(13147 , 4 , 12));
        System.out.println(Better(13147 , 4 , 12));
    }
}
