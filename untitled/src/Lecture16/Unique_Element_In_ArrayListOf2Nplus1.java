package Lecture16;

import java.util.*;

public class Unique_Element_In_ArrayListOf2Nplus1 {

    public static int Solution(ArrayList<Integer> a){
        int res=0;
        for(int x : a){
            res^=x;
        }
        return  res;
    }

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,8,2,1,3,5,4));
        System.out.println(Solution(list));

    }
}
