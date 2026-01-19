package LeetCode;

public class Length_Of_Last_Word {

    public static int lengthOfLastWord(String s) {
        s=s.strip();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return s.length()-i-1;
            }
        }
        return s.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
