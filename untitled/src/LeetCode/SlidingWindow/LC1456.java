package LeetCode.SlidingWindow;

public class LC1456 {

    public static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }

    public static int Better(String s , int k) {
        int n = s.length();
        int max = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        max = count;

        for(int i=k; i<n; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            max = Math.max(max , count);
        }
        return max;
    }

    public static int Brute(String s, int k) {
        int n = s.length();
        int max = 0;
        for(int i=0; i<=n-k; i++){
            int count = 0;
            for(int j=i; j<i+k; j++){
                if(isVowel(s.charAt(j))){
                    count++;
                }
            }
            max = Math.max(max , count);
        }
        return max;
    }

    public  static void main(String[] args){
        System.out.println(Brute("abciiidef" , 3));
        System.out.println(Brute("aeiou" , 2));
        System.out.println(Better("abciiidef" , 3));
        System.out.println(Better("aeiou" , 2));
    }
}
