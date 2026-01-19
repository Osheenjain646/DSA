package Lecture17;

public class Infinite_GP {
    public static void main(String[] args) {
        float a =2f;
        float sum = 0f;
        float r = 0.5f;

        while (a!=0){
            sum = sum + a;
            a = a*r;
        }

        System.out.println(sum);
    }
}
