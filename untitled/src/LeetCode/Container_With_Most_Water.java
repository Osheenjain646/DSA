package LeetCode;

public class Container_With_Most_Water {

    public static int maxArea(int[] height){
        int maxWater=0;
        int n=height.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int minHeight=Math.min(height[i],height[j]);
            maxWater=Math.max(maxWater,(minHeight*(j-i)));
            if (height[i]<height[j]){
                i++;
            }else {
                j--;
            }
        }
        return maxWater;
    }

    public static int maxAreaBruteForce(int[] height) {
        int maxWater = 0;
        int n = height.length;
        for (int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int minHeight = Math.min(height[i],height[j]);
                maxWater=Math.max(maxWater,(minHeight*(j-i)));
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {

    }
}
