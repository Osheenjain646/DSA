package Lecture36;

public class Tiling_Problem {

    public static int Tiles(int n){
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }

        return Tiles(n-1)+Tiles(n-2);
    }

    public static void main(String[] args){
        System.out.println(Tiles(10));
    }
}
