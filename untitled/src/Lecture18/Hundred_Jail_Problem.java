package Lecture18;

import java.util.Arrays;

public class Hundred_Jail_Problem {

    public static void jailer_Problem_Optimal(){
        int ans=0;
        int left=0;
        int right=100;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (mid*mid<=100){
                ans=mid;
                left=mid+1;
            }
            else right=mid-1;
        }
        System.out.println(ans);
    }

    public static void jailer_Problem_Better(){
        // We need only the numbers which have odd number of divisors only so for it
        // calculate the number of numbers from 1 to 100 which have perfect squares value
        // from 1 to 100

        int i=0;
        while (i*i<=100){
            i++;
        }
        System.out.println(i-1);
    }

    public static void jailer_Problem_BruteForce(){
        int[] doors = new int[101];
        Arrays.fill(doors, 0);
        for (int round=1; round<doors.length; round++){
            for (int door=round; door< doors.length; door+=round){
                doors[door]=1-doors[door];
            }
        }
        int count=0;
        for (int i=1; i<doors.length; i++){
            if (doors[i]==1){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main() {
        jailer_Problem_BruteForce();
        jailer_Problem_Better();
        jailer_Problem_Optimal();
    }
}
