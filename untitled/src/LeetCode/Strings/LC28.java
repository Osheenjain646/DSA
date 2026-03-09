package LeetCode.Strings;

public class LC28 {



    public static int Brute(String haystack , String needle){
        int i=0;
        int j=0;
        while(j<haystack.length()){
            if(needle.charAt(i)==haystack.charAt(j)){
                i++;
                j++;
                if(i==needle.length()){
                    return j-i;
                }
            }else{
                j=j-i+1;
                i=0;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(Brute("sadbutsad", "sad"));
        System.out.println(Brute("leetcode" , "leeto"));
    }
}
