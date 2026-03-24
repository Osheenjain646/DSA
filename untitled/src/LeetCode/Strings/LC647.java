package LeetCode.Strings;

public class LC647 {

    public static boolean isPalindrome(String subString){
        int start = 0;
        int end = subString.length()-1;
        while (start<end){
            if (subString.charAt(start)!=subString.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static int Brute(String s){
        int count =0;
        for (int i=0; i<s.length(); i++){
            for (int j=i; j<s.length(); j++){
                String subString = s.substring(i,j+1);
                if (isPalindrome(subString)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(Brute("abc"));
        System.out.println(Brute("aaa"));
    }
}
