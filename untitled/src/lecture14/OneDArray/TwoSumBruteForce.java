package lecture14.OneDArray;

public class TwoSumBruteForce {
    public static void solution(int[] arr, int target){
        for (int i =0; i<arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,8,10,13,11};
        int target = 15;
        solution(arr, target);
    }
}
