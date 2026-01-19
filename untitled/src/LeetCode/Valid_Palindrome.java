package LeetCode;

public class Valid_Palindrome {

    public static boolean isPalindromeOptimized(String s){
        int start = 0;
        int end = s.length()-1;
        while (start < end){
            if (!Character.isLetterOrDigit(s.charAt(start))){
                start++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(end))){
                end--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }

            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeBetter(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (Character.isLetterOrDigit(s.charAt(start))) {
                if (Character.isLetterOrDigit(s.charAt(end))) {
                    if (s.charAt(start) != s.charAt(end)) {
                        return false;
                    }
                    else {
                        start++;
                        end--;
                    }
                }
                else {
                    end--;
                }
            }
            else {
                start++;
            }
        }
        return true;
    }

    public static boolean isPalindromeBruteForce(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        s=sb.toString();
        String s1 = s.toLowerCase();

        int start = 0;
        int end = s1.length()-1;
        while (start<end){
            if (s1.charAt(start)!=s1.charAt(end)){
                return false;
            }else {
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "race a car";
        System.out.println(isPalindromeBruteForce(s));
        System.out.println(isPalindromeBruteForce(s1));
        System.out.println(isPalindromeBetter(s));
        System.out.println(isPalindromeBetter(s1));
        System.out.println(isPalindromeOptimized(s));
        System.out.println(isPalindromeOptimized(s1));
    }
}
