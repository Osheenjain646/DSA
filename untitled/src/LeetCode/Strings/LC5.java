package LeetCode.Strings;

public class LC5 {

    public static String Better(String s){
        int maxLen = 0;
        String largestSubstring = "";
        int n = s.length();
        for(int i=0; i<n; i++){
            // odd length
            int p1 = i;
            int p2 = i+1;
            while (p1>=0 && p2<n && (s.charAt(p1)==s.charAt(p2))){
                p1--;
                p2++;
            }
            int len = p2-p1-1;
            if (len>maxLen){
                largestSubstring=s.substring(p1+1,p2);
                maxLen = len;
            }
            // even length
            p1 = i;
            p2 = i;
            while (p1>=0 && p2<n && (s.charAt(p1)==s.charAt(p2))){
                p1--;
                p2++;
            }
            len = p2-p1-1;
            if (len>maxLen){
                largestSubstring=s.substring(p1+1,p2);
                maxLen = len;
            }
        }
        return largestSubstring;
    }

    public static boolean isPalindrome(String s){
        int start =0;
        int end =s.length()-1;
        while (start<end && s.charAt(start)==s.charAt(end)){
            start++;
            end--;
        }
        return start >= end;
    }

    public static String Brute(String s){
        int maxLen =0;
        String largestSubstring = "";
        for (int i=0; i<s.length(); i++){
            for (int j=i; j<s.length(); j++){
                String subString = s.substring(i,j+1);
                if (isPalindrome(subString)){
                    if ((j-i+1)>maxLen){
                        largestSubstring=s.substring(i,j+1);
                        maxLen=Math.max(maxLen , (j-i+1));
                    }
                }
            }
        }
        return largestSubstring;
    }

    public static void main(String[] args){
//        System.out.println(Brute("abacab"));
//        System.out.println(Brute("bacab"));
        System.out.println(Better("abacab"));
        System.out.println(Better("bacab"));
    }
}
