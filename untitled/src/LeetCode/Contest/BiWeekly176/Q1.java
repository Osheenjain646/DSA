package LeetCode.Contest.BiWeekly176;

public class Q1 {

    public static String mapWordWeightsBruteForce(String[] words , int[] weights){
        String output = "";
        for (int i=0; i<words.length; i++){
            int sum=0;
            for (int j=0; j<words[i].length(); j++){
                sum+=weights[words[i].charAt(j)-'a'];
            }
            int index = sum%26;
            output = output + (char) ('z'-index);
        }
        return output;
    }

    public static String mapWordWeightsOptimal(String[] words , int[] weights){
        // next time don't ever do like this otherwise you have to slap your own face
        char[] reversed = new char[]{'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        StringBuilder output = new StringBuilder();
        for (int i=0; i<words.length; i++){
            int sum=0;
            for (int j=0; j<words[i].length(); j++){
                sum+=weights[words[i].charAt(j)-'a'];
            }
            int index = sum%26;
            output.append(reversed[index]);
        }
        return output.toString();
    }

    public static void main(String[] args){
        String[] words = new String[]{"abcd","def","xyz"};
        int[] weights = new int[]{5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeightsBruteForce(words,weights));
        System.out.println(mapWordWeightsOptimal(words,weights));
    }
}
