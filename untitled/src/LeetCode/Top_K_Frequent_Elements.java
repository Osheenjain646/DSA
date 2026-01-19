package LeetCode;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Top_K_Frequent_Elements {

    public static int[] topKFrequentBruteForce(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for (int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        ArrayList<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer , Integer> entry : map.entrySet()){
            int[] arr= new int[2];
            arr[0]=entry.getKey();
            arr[1]=entry.getValue();
            list.add(arr);
        }

        list.sort((a,b)->b[1]-a[1]);

        int[] ans = new int[k];
        for (int i = 0; i < k; i++){
            ans[i]=list.get(i)[0];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequentBruteForce(new int[]{1,1,1,2,2,3} ,2)));
    }
}
