package LeetCode;

import java.util.*;

public class Pascals_Triangle_II {

    public static List<Integer> getRowOptimal(int rowIndex) {        // without increasing the value of the rowInd3ex given
        List<Integer> result = new ArrayList<>();
        long ans=1;
        result.add((int)ans);
        for (int j=1; j<=rowIndex; j++){
            ans=ans*(rowIndex-j+1)/j;
            result.add((int)ans);
        }
        return result;
    }

    public static List<Integer> getRowBruteForce(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        rowIndex = rowIndex+1;
        long ans=1;
        result.add((int) ans);
        for (int j=1; j<rowIndex; j++){
            ans=ans*(rowIndex-j);
            ans=ans/j;
            result.add((int)ans);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getRowBruteForce(3));
        System.out.println(getRowBruteForce(5));
        System.out.println(getRowOptimal(6));
        System.out.println(getRowOptimal(7));
    }
}
