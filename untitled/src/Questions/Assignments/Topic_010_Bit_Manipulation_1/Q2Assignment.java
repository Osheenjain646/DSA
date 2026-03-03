package Questions.Assignments.Topic_010_Bit_Manipulation_1;

public class Q2Assignment {
    // Add Binary String

    public static String addBinary(String A , String B){
        int i = A.length()-1;
        int j = B.length()-1;
        int carry=0;
        String ans = "";
        while (i>=0 || j>=0){
            int a = 0;
            int b = 0;
            int sum = carry;
            if (i>=0){
                a = Integer.parseInt(String.valueOf(A.charAt(i)));
                sum = sum +a;
                i--;
            }

            if (j>=0){
                b = Integer.parseInt(String.valueOf(B.charAt(j)));
                sum = sum +b;
                j--;
            }

            if(sum == 2) {
                carry = 1;
                ans = "0" + ans;
            } else if(sum > 2) {
                carry = 1;
                ans = "1" + ans;
            } else if(sum == 0) {
                carry = 0;
                ans = "0" + ans;
            }
            else {
                carry = 0;
                ans = "1" + ans;
            }

        }
        if (carry==1){
            ans = "1" + ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("100" , "11"));
    }
}
