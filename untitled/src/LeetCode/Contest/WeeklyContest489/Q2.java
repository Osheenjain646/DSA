package LeetCode.Contest.WeeklyContest489;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q2 {

    public static int firstUniqueFreqOptimal3(int[] nums){  // using the static array instead of the HashMap or HashSet
        int max =0;
        for (int num : nums){
            if (num>max){
                max=num;
            }
        }

        int[] freq = new int[max+1];
        for (int num : nums){
            freq[num]++;
        }

        int[] freqCount = new int[nums.length+1];
        for (int i : freq){
            if (i>0){
                freqCount[i]++;
            }
        }

        for (int num : nums){
            if (freqCount[freq[num]]==1){
                return num;
            }
        }
        return -1;
    }

    public static int firstUniqueFreqOptimal2(int[] nums){
        HashMap<Integer , Integer> freq = new HashMap<>();
        for (int num : nums){
            freq.put(num , freq.getOrDefault(num , 0)+1);
        }

        HashMap<Integer , Integer> freqCount = new HashMap<>();
        for (int f : freq.values()){
            freqCount.put(f , freqCount.getOrDefault(f , 0)+1);
        }

        for (int num : nums){
            int freq1 = freq.get(num);
            if (freqCount.get(freq1)==1){
                return num;
            }
        }
        return -1;
    }

    public static int firstUniqueFreqOptimal1(int[] nums){
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num , map.getOrDefault(num , 0)+1);
        }

        HashSet<Integer> single = new HashSet<>();
        HashSet<Integer> Duplicate = new HashSet<>();
        for (Map.Entry<Integer , Integer> entry : map.entrySet()){
            if (single.contains(entry.getValue())){
                Duplicate.add(entry.getValue());
            }else {
                single.add(entry.getValue());
            }
        }

        for (int num : nums){
            if (!Duplicate.contains(map.get(num))){
                return num;
            }
        }
        return -1;
    }

    public static int firstUniqueFreqBetter(int[] nums){       // Wrong Approach you don't see that you are checking for the same frequency which will be always present
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num , map.getOrDefault(num , 0)+1);
        }

        for (int i=0; i<nums.length; i++){
            int val = map.get(nums[i]);
            if (!map.containsValue(val)){
                return nums[i];
            }
        }
        return -1;
    }

    public static int firstUniqueFreqBruteForce(int[] nums){
        int[] Freq = new int[100001];
        for (int num : nums){
            Freq[num]++;
        }

        for (int i=0; i<nums.length; i++){
            if (Freq[nums[i]]!=0){
                boolean flag=false;
                for (int j=0; j< nums.length; j++){
                    if (Freq[nums[j]]!=0){
                        if (Freq[nums[j]]==Freq[nums[i]]&&nums[i]!=nums[j]){
                           flag=true;
                           break;
                        }
                    }
                }
                if (!flag){
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(firstUniqueFreqBruteForce(new int[]{20,10,30,30}));
        System.out.println(firstUniqueFreqBruteForce(new int[]{20,20,10,30,30,30}));
        System.out.println(firstUniqueFreqBruteForce(new int[]{10,10,20,20}));
        System.out.println(firstUniqueFreqBetter(new int[]{20,10,30,30}));
        System.out.println(firstUniqueFreqBetter(new int[]{20,20,10,30,30,30}));
        System.out.println(firstUniqueFreqBetter(new int[]{10,10,20,20}));
        System.out.println(firstUniqueFreqOptimal1(new int[]{20,10,30,30}));
        System.out.println(firstUniqueFreqOptimal1(new int[]{20,20,10,30,30,30}));
        System.out.println(firstUniqueFreqOptimal1(new int[]{10,10,20,20}));
        System.out.println(firstUniqueFreqOptimal2(new int[]{20,10,30,30}));
        System.out.println(firstUniqueFreqOptimal2(new int[]{20,20,10,30,30,30}));
        System.out.println(firstUniqueFreqOptimal2(new int[]{10,10,20,20}));
        System.out.println(firstUniqueFreqOptimal3(new int[]{20,10,30,30}));
        System.out.println(firstUniqueFreqOptimal3(new int[]{20,20,10,30,30,30}));
        System.out.println(firstUniqueFreqOptimal3(new int[]{10,10,20,20}));
    }
}
