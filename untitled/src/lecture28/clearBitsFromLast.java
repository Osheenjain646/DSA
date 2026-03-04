package lecture28;

public class clearBitsFromLast {

    public static int Optimal(int n , int i){
        int mask = (-1<<i);
        n = n&mask;
        return n;
    }

    public static int Better(int n , int i){
        for (int j=0; j<i; j++){
            if ((n&(1<<j))!=0){
                n = n&(~(1<<j));
            }
        }
        return n;
    }

    public static int Brute(int n , int i){
        n = n>>i;
        n = n<<i;
        return n;
    }

    public static void main(String[] args){
        System.out.println(Brute(13 , 2));
        System.out.println(Better(13 , 2));
        System.out.println(Optimal(13 , 2));
    }
}
