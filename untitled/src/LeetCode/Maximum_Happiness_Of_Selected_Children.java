package LeetCode;
import java.util.*;
public class Maximum_Happiness_Of_Selected_Children {

    public static long maxHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n=happiness.length;
        long sum =0;
        long decreaseby=0;
        for(int i=n-1; i>=n-k; i--){
            if(happiness[i]+decreaseby<=0){
                break;
            }
            sum+=(happiness[i]+decreaseby);
            decreaseby--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int k1 = 2;
        System.out.println(maxHappinessSum(arr1,k1));
        int[] arr2 = {1,1,1,1};
        int k2 = 2;
        System.out.println(maxHappinessSum(arr2,k2));
        int[] arr3 = {2,3,4,5};
        int k3 = 1;
        System.out.println(maxHappinessSum(arr3,k3));
    }
}
