package LeetCode.Bit_Manipulation;

public class Change_ith_Bit_To_0 {

    public static int setBit(int number , int i){
        if ((number & (1<<i)) != 0) {
            number = number - (int) Math.pow(2,i);
        }
        return number;
    }

    public static void main(String[] args){
        System.out.println(setBit(13,2));
        System.out.println(setBit(255 , 7));
    }
}
