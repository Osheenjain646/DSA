package Lecture33;
// find the number of special indexes such that the sum of all
// even and odd index elements are equal in new temp array such that
// the spl index element is not present in that temp array
public class Count_Of_Indices_Array {

    public static int[] buildEvenPrefix(int[] nums){
        int n = nums.length;
        int[] prefixEven = new int[n];
        prefixEven[0] = nums[0];
        for (int i=1; i<n; i++){
            if (i%2==0){
                prefixEven[i] = prefixEven[i-1] + nums[i];
            }else {
                prefixEven[i] = prefixEven[i-1];
            }
        }
        return prefixEven;
    }

    public static int[] buildOddPrefix(int[] nums){
        int n = nums.length;
        int[] prefixOdd = new int[n];
        prefixOdd[0]= 0;
        for (int i =1; i<n; i++){
            if (i%2!=0){
                prefixOdd[i] = prefixOdd[i-1] + nums[i];
            }else {
                prefixOdd[i] = prefixOdd[i-1];
            }
        }
        return prefixOdd;
    }

    public static int Better(int[] nums){
        int n = nums.length;
        int[] prefixEven = buildEvenPrefix(nums);
        int[] prefixOdd = buildOddPrefix(nums);
        int count =0;
        for (int i=0 ; i<n; i++){
            int evenSum;
            int oddSum;
            if(i==0){
                evenSum = prefixOdd[n-1]-prefixOdd[i];
                oddSum = prefixEven[n-1]-prefixEven[i];
            }else {
                evenSum = prefixEven[i-1]+prefixOdd[n-1]-prefixOdd[i];
                oddSum = prefixOdd[i-1]+prefixEven[n-1]-prefixEven[i];
            }
            if (evenSum == oddSum){
                count++;
            }
        }
        return count;
    }

    public static int Brute(int[] nums){
        int count = 0;
        int n = nums.length;
        for(int i =0; i<n; i++){
            int[] temp = new int[n-1];
            int k=0;
            for(int j=0; j<n; j++){
                if(j==i){
                    continue;
                }
                temp[k++] = nums[j];
            }

            int evenSum = 0;
            int oddSum = 0;
            for (int j =0; j<temp.length; j++){
                if(j%2==0){
                    evenSum+=temp[j];
                }else {
                    oddSum+=temp[j];
                }
            }

            if (evenSum == oddSum){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(Brute(new int[]{4,3,2,7,6,-2}));
        System.out.println(Better(new int[]{4,3,2,7,6,-2}));
    }
}
