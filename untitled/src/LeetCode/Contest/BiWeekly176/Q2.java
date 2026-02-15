package LeetCode.Contest.BiWeekly176;

import java.util.HashMap;

public class Q2 {

    public static int prefixConnectedOptimal(String[] words , int k){
        HashMap<String , Integer> map = new HashMap<>();
        int connectedGroup=0;
        for (int i=0; i< words.length; i++){
            if (words[i].length()<k){
                continue;
            }
            String subString = words[i].substring(0,k);
            map.put(subString , map.getOrDefault(subString , 0) +1);
        }
        for (int value : map.values()){
            if (value>=2){
                connectedGroup++;
            }
        }
        return connectedGroup;
    }

    public static int prefixConnectedBruteForce(String[] words , int k){
        HashMap<String , Integer> map = new HashMap<>();
        int connectedGroup=0;
        for (int i=0; i<words.length-1; i++){
            if (words[i].length()<k){
                continue;
            }
            String subString = words[i].substring(0,k);
            map.putIfAbsent(subString,1);
            for (int j=i+1; j<words.length; j++){
                if (words[j].length()>=k){
                    if (subString.equals(words[j].substring(0,k))){
                        map.put(subString,map.getOrDefault(subString,0)+1);
                    }
                }
            }
        }
        for (int value : map.values()){
            if (value>=2){
                connectedGroup++;
            }
        }
        return connectedGroup;
    }

    public static void main(String[] args){
        String[] words = new String[]{"apple","apply","banana","bandit"};
        int k=2;
        System.out.println(prefixConnectedBruteForce(words,k));
        System.out.println(prefixConnectedOptimal(words,k));
    }
}
