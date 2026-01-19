package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {

    public static List<List<String>> groupAnagramsBetter1(String[] strs) {
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        for (String str : strs){
            int[] count = new int[26];
            for(char c : str.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            map.putIfAbsent(key , new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static List<List<String>> groupAnagramsBetter(String[] strs){
        HashMap<String , List<String>> map =  new HashMap<>();
        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        List<List<String>> ans = new ArrayList<>(map.values());
        return ans;
    }

    public static List<List<String>> groupAnagramsBruteForce(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String , List<String>> map =  new HashMap<>();
        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        for (List<String> list : map.values()){
            ans.add(list);
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagramsBruteForce(strs));
        System.out.println(groupAnagramsBetter(strs));
        System.out.println(groupAnagramsBetter1(strs));
    }
}
