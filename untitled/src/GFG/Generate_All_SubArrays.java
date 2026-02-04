package GFG;

import java.util.ArrayList;

public class Generate_All_SubArrays {

//    public static ArrayList<ArrayList<Integer>> Better(int[] arr){
//
//    }

    public static ArrayList<ArrayList<Integer>> BruteForce(int[] arr){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                ArrayList<Integer> list = new ArrayList<>();
                for (int k=i; k<=j; k++){
                    list.add(arr[k]);
                }
                res.add(list);
            }
        }
        return res;
    }

    static void main() {

    }
}
