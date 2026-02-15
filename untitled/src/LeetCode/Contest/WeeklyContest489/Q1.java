package LeetCode.Contest.WeeklyContest489;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {

    public static List<Integer> toggleLightBulbsBrute(List<Integer> Bulbs){
        List<Integer> result = new ArrayList<>();
        boolean[] status = new boolean[101];
        Arrays.fill(status,false);
        for (int bulb : Bulbs){
            if (status[bulb]){
                status[bulb]=false;
            }
            else {
                status[bulb]=true;
            }
        }
        for (int i=0; i<status.length; i++){
            if (status[i]){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args){

    }
}
