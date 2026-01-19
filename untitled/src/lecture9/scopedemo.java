// example of scope of a variable
package lecture9;

public class scopedemo {
    public static void main(String[] args) {
        int money;
        if (true){
            money=20;
        }
        System.out.println(money);
    }
}
