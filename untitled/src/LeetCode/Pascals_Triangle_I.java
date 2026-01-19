package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_I {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long ans=1;
        row.add((int) ans);
        for (int j=1; j<rowIndex; j++){
            ans=ans*(rowIndex-j);
            ans=ans/j;
            row.add((int) ans);
        }
        return row;
    }

    public static List<List<Integer>> generateOptimal(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        for (int i=1; i<=numRows;i++){
            result.add(getRow(i));
        }
        return result;
    }

    public static List<List<Integer>> generateBruteForce(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> FirstRow = new ArrayList<>();
        FirstRow.add(1);
        result.add(FirstRow);

        for (int i=1; i<numRows; i++){
            List<Integer> previousRow = result.get(i-1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j=1; j<i; j++){
                currentRow.add(previousRow.get(j-1)+previousRow.get(j));
            }
            currentRow.add(1);
            result.add(currentRow);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generateBruteForce(5));
        System.out.println(generateOptimal(5));
    }
}
