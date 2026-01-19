package lecture10;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 645;
        int b = 85;

        int large = a>b ? a : b;
        System.out.println(large);

        // different

        System.out.println(large%2==0 ? "Even":"Odd");

        for (int i =1; i<=10; i++){
            System.out.println(i%2==0 ? "Even " + i:"Odd " + i);
        }

        for (int i =1; i<= (a>b? a:b); i++){
            System.out.println(i%2==0 ? "Even " + i:"Odd " + i);
        }
    }
}
