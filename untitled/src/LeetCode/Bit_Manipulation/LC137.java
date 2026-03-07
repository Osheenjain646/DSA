package LeetCode.Bit_Manipulation;

import java.util.Arrays;
import java.util.HashMap;

public class LC137 {

    public static int Optimal3(int[] nums){
        int ones =0;
        int twos =0;

        for (int x : nums){
            ones = (ones^x) & ~twos;
            twos = (twos^x) & ~ones;
        }
        return ones;
    }

    public static int Optimal2(int[] nums){
        // Using bit manipulation and this will handle -ve numbers too
        int uniqueNumber =0;
        int[] freq = new int[32];

        for (int x : nums){
            for (int i=0; i< freq.length; i++){
                if ((x&(1<<i))!=0){
                    freq[i]++;
                }
            }
        }

        for (int i=0; i<32; i++){
            freq[i]%=3;

            if (freq[i]!=0){
                uniqueNumber |= (1<<i);
            }
        }
        return uniqueNumber;
    }

    public static int Optimal1(int[] nums){
        // Using the bit manipulation
        // This will not able to handle -ve numbers
        int uniqueNumber =0;
        int[] freq = new int[32];

        for (int x : nums){
            int j=0;
            while (x>0){
                int lastBit = (x&1);
                freq[j]+=lastBit;
                j++;
                x=x>>1;
            }
        }

        int mul=1;
        for (int i=0; i<freq.length; i++){
            freq[i] = freq[i]%3;

            uniqueNumber+=freq[i]*mul;
            mul=mul<<1;// same as power *2
        }

        return uniqueNumber;
    }

    public static int Better3(int[] nums){
        // Using HashMap

        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        }

        for (Integer entry : map.keySet()){
            if (map.get(entry)==1){
                return entry;
            }
        }
        return -1;
    }

    public static int Better2(int[] nums){
        // sorting
        Arrays.sort(nums);
        int count = 0;
        int curr = nums[0];
        for (int i=1; i<nums.length; i++){
            if (nums[i]==curr){
                count++;
            }else {
                if (count==1){
                    return curr;
                }
                curr=nums[i];
                count=1;
            }
        }
        if (count==1){
            return curr;
        }
        return nums[0];
    }

    public static int Better1(int[] nums){
        int unique =0;
        for (int i=0; i<nums.length; i++){
            boolean flag = true;
            for (int j=0; j<nums.length; j++){
                if (j==i){
                    continue;
                }
                if (nums[i]==nums[j]){
                    flag=false;
                    break;
                }
            }
            if (flag){
                unique=nums[i];
                break;
            }
        }
        return unique;
    }

    public static int Brute(int[] nums){
        // wrong approach as checking only with the next elements but might be present
        // before the element so will wrong answer
        int unique =0;
        for (int i=0; i<nums.length; i++){
            boolean flag = true;
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]==nums[j]){
                    flag=false;
                    break;
                }
            }
            if (flag){
                unique=nums[i];
                break;
            }
        }
        return unique;
    }

    public static void main(String[] args){
//        System.out.println(Brute(new int[]{2,2,3,2}));
//        System.out.println(Brute(new int[]{0,1,0,1,0,1,99}));
        System.out.println(Better1(new int[]{2,2,3,2}));
        System.out.println(Better1(new int[]{0,1,0,1,0,1,99}));
        System.out.println(Better2(new int[]{2,2,3,2}));
        System.out.println(Better2(new int[]{0,1,0,1,0,1,99}));
        System.out.println(Better3(new int[]{2,2,3,2}));
        System.out.println(Better3(new int[]{0,1,0,1,0,1,99}));
        System.out.println(Optimal1(new int[]{2,2,3,2}));
        System.out.println(Optimal1(new int[]{0,1,0,1,0,1,99}));
        System.out.println(Optimal2(new int[]{2,2,3,2}));
        System.out.println(Optimal2(new int[]{0,1,0,1,0,1,99}));
        System.out.println(Optimal3(new int[]{2,2,3,2}));
        System.out.println(Optimal3(new int[]{0,1,0,1,0,1,99}));
    }
}
