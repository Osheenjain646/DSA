package LeetCode;

public class LC67 {

    public static String Better(String A , String B){
        // Using String Builder
        StringBuilder str = new StringBuilder();
        int i = A.length()-1;
        int j = B.length()-1;
        int carry =0;
        while (i>=0 || j>=0 || carry!=0){
            int sum = carry;
            if (i>=0){
                sum+=A.charAt(i)-'0';
            }
            if (j>=0){
                sum+=B.charAt(j)-'0';
            }
            i--;
            j--;
            str.append(sum%2);
            carry=sum/2;
        }
        return str.reverse().toString();
    }

    public static String BruteForce(String A , String B ){
         int i = A.length()-1;
         int j = B.length()-1;
         int carry = 0;
         String ans = "";
         while(i>=0 || j>=0){
             int sum=carry;
             if(i>=0){
                 sum+=Integer.parseInt(String.valueOf(A.charAt(i)));
                 i--;
             }

             if(j>=0){
                 sum+=Integer.parseInt(String.valueOf(B.charAt(j)));
                 j--;
             }

             if(sum>2){
                 carry=1;
                 ans = "1" + ans;
             }else if(sum==2){
                 carry=1;
                 ans = "0" + ans;
             }else if(sum==1){
                 carry=0;
                 ans = "1" +ans;
             }else{
                 carry = 0;
                 ans = "0" +ans;
             }
         }
         if(carry==1){
             ans = "1" +ans;
         }
         return ans;
    }

    public static void main(String[] args){
        System.out.println(BruteForce("11" , "1"));
        System.out.println(BruteForce("1010" , "1011"));
        System.out.println(Better("11" , "1"));
        System.out.println(Better("1010" , "1011"));
    }
}
