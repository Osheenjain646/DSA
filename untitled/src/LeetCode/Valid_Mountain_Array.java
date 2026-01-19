package LeetCode;

public class Valid_Mountain_Array {

    public static boolean validMountainArray(int[] arr){
        if (arr.length<3){
            return false;
        }
        int j=0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            else if (arr[i] == max){
                return false;
            }
            else {
                j=i;
                break;
            }
        }
        if (max == arr[0]){
            return false;
        }
        for (int i=j+1; i<arr.length; i++){
            if (arr[i]>=arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{2,1}));
        System.out.println(validMountainArray(new int[]{3,5,5}));
        System.out.println(validMountainArray(new int[]{0,3,2,1}));
    }
}
