package lecture13;

import java.util.Arrays;

public class PassValueObject {

    public static void Double(int[] money){
        System.out.println(money);
        for (int i = 0; i < money.length; i++){
            money[i] = 2*money[i];
        }
        System.out.println(Arrays.toString(money));
    }

    public static void main(String[] args) {
        int[] money = {10,20,30};
        Double(money);
        System.out.println(money);
        System.out.println(Arrays.toString(money));
    }
}
