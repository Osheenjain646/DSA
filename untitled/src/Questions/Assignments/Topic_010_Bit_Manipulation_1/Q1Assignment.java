package Questions.Assignments.Topic_010_Bit_Manipulation_1;

public class Q1Assignment {

    public static int singleNumber(int[] nums){
        // XOR of each number
        int number = 0;
        for (int i=0; i<nums.length; i++){
            number^=nums[i];
        }
        return number;
    }

    public static void main(String[] args){
        System.out.println(singleNumber(new int[]{1,2,2,3,1}));
        System.out.println(singleNumber(new int[]{1,2,2}));
    }
}
