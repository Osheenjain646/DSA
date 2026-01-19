package lecture13;

public class PassByValue {

    public static void Double(int money){
        money=money*2;
        System.out.println(money);
    }

    public static void main(String[] args) {
        int money = 100;
        Double(money);
        System.out.println(money);
    }
}
