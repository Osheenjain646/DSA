package GFG;

import java.util.ArrayList;

public class AlternatesInAnArray {

    public static void AlternateRecursive(int[] arr , int index , ArrayList<Integer> res){
        if (index<arr.length){
            res.add(arr[index]);
            AlternateRecursive(arr, index+2, res);
        }
    }

    public static ArrayList<Integer> getAlternatesRecursiveApproach(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        int index=0;
        AlternateRecursive(arr,index,res);
        return res;
    }

    public static ArrayList<Integer> getAlternatesIterativeApproach(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=0; i<arr.length; i+=2){
            res.add(arr[i]);
        }
        return res;
    }

    static void main() {

    }
}
