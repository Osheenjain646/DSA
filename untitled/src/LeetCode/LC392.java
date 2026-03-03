package LeetCode;

public class LC392 {

    // same as brute for all other solutions
    // better have variables to hold the lengths of t and s
    // optimal has character array to check the data

    public static boolean Optimal(String s , String t){
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int i=0;
        for (int j=0; j<tArr.length && i<sArr.length; j++){
            if (sArr[i]==tArr[j]){
                i++;
            }
        }
        return i==sArr.length;
    }

    public static boolean Better(String s , String t){
        int tLength = t.length();
        int sLength = s.length();
        int i =0;
        int j =0;
        while (i<sLength && j<tLength){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==sLength;
    }

    public static boolean BruteForce(String s , String t){
        int i=0;
        int j=0;
        while (i<s.length() && j<t.length()){
            if (t.charAt(j)==s.charAt(i)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args){
        System.out.println(BruteForce("abc" , "ahbgdc"));
        System.out.println(Better("abc" , "ahbgdc"));
        System.out.println(Optimal("abc" , "ahbgdc"));
    }
}
