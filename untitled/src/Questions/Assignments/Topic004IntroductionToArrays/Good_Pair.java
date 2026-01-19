package Questions.Assignments.Topic004IntroductionToArrays;

public class Good_Pair {

    public static boolean Output(int[] arr, int target){
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        int target = 4;
        System.out.println(Output(arr,target));
    }
}
