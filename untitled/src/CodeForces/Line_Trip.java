package CodeForces;

import java.util.Scanner;

public class Line_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] gasStations = new int[n];
            for (int i = 0; i < n; i++) {
                gasStations[i] = sc.nextInt();
            }

            int maxFuel = gasStations[0];
            for (int i=1; i<n; i++){
                maxFuel=Math.max(maxFuel,(gasStations[i]-gasStations[i-1]));
            }
            maxFuel=Math.max(maxFuel,((x-gasStations[n-1])*2));
            System.out.println(maxFuel);
        }
        return;
    }
}
