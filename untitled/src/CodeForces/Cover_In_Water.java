package CodeForces;

import java.util.Scanner;

public class Cover_In_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int  n = sc.nextInt();
            String s = sc.next();
            boolean flag = false;
            for (int i=0;i<n-2;i++){
                if (s.charAt(i)=='.' && s.charAt(i+1)=='.' && s.charAt(i+2)=='.'){
                    flag = true;
                    break;
                }
            }
            if (flag){
                System.out.println(2);
            }
            else {
                int count = 0;
                for (int i=0;i<n;i++) {
                    if (s.charAt(i) == '.') {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        return;
    }
}
