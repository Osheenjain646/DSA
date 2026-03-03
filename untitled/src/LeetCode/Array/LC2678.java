package LeetCode.Array;

public class LC2678 {

    public static int Better(String[] details) {
        int count = 0;
        for (String x : details) {
            int age = x.charAt(11)-'0';
            age = age*10 + (x.charAt(12)-'0');
            if (age > 60) {
                count++;
            }
        }
        return count;
    }

    public static int BruteForce(String[] details){
        int count=0;
        for (String x : details){
            int age = Integer.parseInt(String.valueOf(x.charAt(11)));
            age = age*10+(Integer.parseInt(String.valueOf(x.charAt(12))));
            if (age>60){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(BruteForce(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"}));
        System.out.println(Better(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"}));
    }
}
