package Lecture33;
// find that element that is occurred more than n/2 times
public class Find_Majority_Element {

    public static int Brute(int[] nums){
        int n = nums.length;
        int maxOccurred = 0;
        int element = -1;
        for (int i=0; i<n; i++){
            int count=0;
            for (int j=i+1; j<n; j++){
                if (nums[j]==nums[i]){
                    count++;
                }
            }
            if (count>maxOccurred){
                element=nums[i];
                maxOccurred=count;
            }
        }
        return maxOccurred>(n/2)?element:-1;
    }

    public static void main(String[] args){
        System.out.println(Brute(new int[]{1,4,4,2,4,4,6,4}));
    }
}
