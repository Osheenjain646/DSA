package LeetCode;

public class Reverse_Vowels_Of_A_String {

    public static boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }

    public static String reverseVowelsBetter(String s){
        char[] s1 =  s.toCharArray();
        int i=0;
        int j=s1.length-1;
        while(i<j){
            if(!isVowel(s1[i])){
                i++;
                continue;
            }
            if(!isVowel(s1[j])){
                j--;
                continue;
            }
            char temp = s1[i];
            s1[i] = s1[j];
            s1[j]= temp;
            i++;
            j--;
        }
        return new String(s1);
    }

    public static String reverseVowelsBruteForce(String s) {
        String vowels = "";
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowels = vowels + s.charAt(i);
            }
        }
        int k = vowels.length();
        char[] s1 = s.toCharArray();
        int i = 0;
        for (int j = 0; j < s1.length; j++) {
            if (isVowel(s1[j])) {
                s1[j] = vowels.charAt(k - i - 1);
                i++;
            }
        }
        return new String(s1);
    }
    public static void main(String[] args) {
        System.out.println(reverseVowelsBruteForce("IceCreAm"));
        System.out.println(reverseVowelsBruteForce("LeetCode"));
        System.out.println(reverseVowelsBetter("IceCreAm"));
        System.out.println(reverseVowelsBetter("LeetCode"));
    }
}
