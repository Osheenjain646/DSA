package LeetCode.Two_Pointer;

import java.util.Arrays;

public class Boats_To_Save_People {

    public static int numRescueBoatsOptimal2(int[] people , int limit){
        // using the counting sort to sort the array then do the same two pointer logic
        int max = Arrays.stream(people).max().getAsInt();
        int[] count = new int[max+1];
        for (int p : people){
            count[p]++;
        }

        int index=0;
        int i=1;
        while (index<people.length){
            while (count[i]==0){
                i++;
            }
            people[index++]=i;
            count[i]--;
        }

        int boats=0;
        int left=0;
        int right=people.length-1;
        while (left<=right){
            if (people[left]+people[right]<=limit){
                left++;
                right--;
                boats++;
            }else {
                right--;
                boats++;
            }
        }
        return boats;
    }

    public static int numRescueBoatsOptimal1(int[] people , int limit){   // using sort and two pointer for boarding the heavier person first and then check for if
        // possible to board the lighter person if yes board them together ith the heavier one so number of boats will be less
        Arrays.sort(people);
        int boats =0;
        int left =0; int right=people.length-1;
        while (left<right){
            if (people[left]+people[right]<=limit){
                left++;
                right--;
                boats++;
            }else {
                right--;
                boats++;
            }
        }
        return boats;
    }

    public static int numRescueBoatsBetter(int[] people , int limit){  // time limit will exceed as we are doing nested work
        int boats=0;
        int n = people.length;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited , false);
        for (int i=0; i<n; i++){
            if(!visited[i]){
                int remainingCapacity=limit-people[i];
                int max =0;
                int index=-1;
                for (int j=i+1; j<n; j++){
                    if (!visited[j]){
                        if (people[j]<=remainingCapacity){
                            if (people[j]>max){
                                max=people[j];
                                index=j;
                            }
                        }
                    }
                }
                if (index!=-1){
                    visited[index]=true;
                }
                boats++;
            }
        }
        return boats;
    }

    public static int numRescueBoatsBruteForce(int[] people , int limit){  // will give wrong answer as we are adding the people as I find them
        // able to board the boat but not checking for the best person to board the boat for less boat to be used
        int boats=0;
        int n = people.length;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        for (int i=0; i<n; i++){
            if (!visited[i]){
                boolean flag=false;
                for (int j=i+1; j<n; j++){
                    if (people[i]+people[j]<=limit){
                        if (!visited[j]){
                            visited[i]=true;
                            visited[j]=true;
                            boats++;
                            flag=true;
                        }
                    }
                }
                if (!flag){
                    boats++;
                    visited[i]=true;
                }
            }
        }
        return boats;
    }

    public static void main(String[] args){

    }
}
