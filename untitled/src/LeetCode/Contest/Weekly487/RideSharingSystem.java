package LeetCode.Contest.Weekly487;

import java.util.ArrayList;
// Q2
public class RideSharingSystem {
    ArrayList<Integer> Rider;
    ArrayList<Integer> Driver;
    ArrayList<int[]> matched;
    int[] record;
        public RideSharingSystem() {
            Rider = new ArrayList<>();
            Driver = new ArrayList<>();
            matched = new ArrayList<>();
        }

        public void addRider(int riderId) {
            Rider.add(riderId);
        }

        public void addDriver(int driverId) {
            Driver.add(driverId);
        }

        public int[] matchDriverWithRider() {
            if (Driver.isEmpty()||Rider.isEmpty()){
                return new int[]{-1,-1};
            }
            record =  new int[2];
            record[0]=Driver.getFirst();
            record[1]=Rider.getFirst();
            Driver.removeFirst();
            Rider.removeFirst();
            matched.add(record);
            return new int[]{Driver.getFirst(),Rider.getFirst()};
        }

        public void cancelRider(int riderId) {
            if (!matched.contains(record[1]==riderId)){
                Rider.remove(riderId);
            }
        }
}
