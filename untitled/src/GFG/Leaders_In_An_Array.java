package GFG;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders_In_An_Array {

    public static ArrayList<Integer> leadersOptimal(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[arr.length-1]);
        int max=arr[arr.length-1];
        for (int i=arr.length-2; i>=0; i--){
            if (arr[i]>=max){
                max=arr[i];
                res.add(arr[i]);
            }
        }
        Collections.reverse(res);
        return res;
    }

    public static ArrayList<Integer> leadersBetter(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[arr.length-1]);
        int max=arr[arr.length-1];
        for (int i=arr.length-2; i>=0; i--){
            if (arr[i]>=max){
                max=arr[i];
                res.addFirst(arr[i]);
            }
        }
        return res;
    }

    public static ArrayList<Integer> leadersBruteForce(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            int j;
            for (j=i+1; j<arr.length; j++){
                if (arr[j]>arr[i]){
                    break;
                }
            }
            if (j==arr.length){
                res.add(arr[i]);
            }
        }
        return res;
    }

    static void main() {

    }
}
