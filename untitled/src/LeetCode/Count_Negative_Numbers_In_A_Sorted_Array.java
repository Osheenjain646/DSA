package LeetCode;

public class Count_Negative_Numbers_In_A_Sorted_Array {

    public static int countNegativesOptimal(int[][] grid){
        int count=0;
        for (int[] m : grid) {
            for (int j = 0; j < m.length; j++) {
                if (m[j] < 0) {
                    count += m.length - j;
                    break;
                }
            }
        }
        return count;
    }

    public static int countNegativesBruteForce(int[][] grid){
        int count=0;
        for (int[] m : grid) {
            for (int n : m) {
                if (n < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNegativesBruteForce(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
        System.out.println(countNegativesBruteForce(new int[][]{{3,2},{1,0}}));
        System.out.println(countNegativesOptimal(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
        System.out.println(countNegativesOptimal(new int[][]{{3,2},{1,0}}));
    }
}
