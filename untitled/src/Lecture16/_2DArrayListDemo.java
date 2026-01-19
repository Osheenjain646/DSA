package Lecture16;

import java.util.*;
public class _2DArrayListDemo {
    public static void main(String[] args) {
//      ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();  Optional to <ArrayList<Integer>> after new;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>(Arrays.asList(1,2,3,4,5)));
        list.add(new ArrayList<>(Arrays.asList(6,7,8,9,10)));

        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
            for (int x: list.get(i)){
                System.out.print(x +" ");
            }
            System.out.println();
        }
        list.get(0).add(11);
        System.out.println(list.get(0).getLast());
        System.out.println(list.get(list.size()-1));
        
    }
}
