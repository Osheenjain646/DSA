package Lecture35;

import java.util.HashMap;

public class Distinct_Elements_In_SubArray_Of_Size_K {
    public static void main(String[] args) {
        int[] array = {1,2,5,6,8,9,4,3,5,9,5,4,9,5,6,6,6,2};
        int k = 5;
        HashMap<Integer , Integer> hm = new HashMap<>();

        // first window
        for (int i=0; i<k; i++){
            hm.put(array[i] , hm.getOrDefault(array[i] , 0)+1);
        }
        System.out.println(hm.size());

        // leftover windows
        for (int i=k; i<array.length; i++){
            hm.put(array[i-k] , hm.getOrDefault(array[i-k] , 0)-1);
            if (hm.get(array[i-k])==0){
                hm.remove(array[i-k]);
            }
            hm.put(array[i] , hm.getOrDefault(array[i] , 0)+1);
            System.out.println(hm.size());
        }
    }
}
