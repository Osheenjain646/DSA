package LeetCode;

public class Valid_Palindrome_II {

    public static boolean isPalindromeBrute(String str){
        int l=0;
        int r=str.length()-1;
        while (l<r){
            if (str.charAt(l)!=str.charAt(r)){
                return  false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static boolean validPalindromeBruteForce(String s){
        String temp ="";
        if (isPalindromeBrute(s)){
            return true;
        }
        for (int i=0; i<s.length(); i++){
            temp = s.substring(0,i)+s.substring(i+1);
            if (isPalindromeBrute(temp)){
                return true;
            }
        }
        return false;
    }

    public static boolean validPalindromeOptimised(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){

                // checking by skipping the left character and checking the right substring
                int start1 = start+1 , end1 = end;
                while (start1<end1 && s.charAt(start1) == s.charAt(end1)){
                    start1++;
                    end1--;
                }

                // checking by skipping the right character and checking the left substring
                int start2=start , end2 = end-1;
                while (start2<end2 && s.charAt(start2) == s.charAt(end2)){
                    start2++;
                    end2--;
                }

                return start1>=end1 || start2>=end2;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = ("aba");
        String s2 = ("abca");
        String s3 = ("eceec");
        System.out.println(validPalindromeOptimised(s1));
        System.out.println(validPalindromeOptimised(s2));
        System.out.println(validPalindromeOptimised(s3));
        System.out.println(validPalindromeBruteForce(s1));
        System.out.println(validPalindromeBruteForce(s2));
        System.out.println(validPalindromeBruteForce(s3));
    }
}
