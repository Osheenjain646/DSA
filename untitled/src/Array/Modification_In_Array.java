package Array;

import java.util.*;

public class Modification_In_Array {

    public static void reverse(ArrayList<Integer> arr, int start, int end){
        while(start<end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }

    static void main() {
        // Arraylist is used mostly used for dynamic behavior

        // Insert Element

        // Insert at end (best case)

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        arr.add(4);//insert at end

        // time complexity
        // O(1)(amortized):- ArrayList internally gets resize that's why amortized O(1)

        // Insert at beginning

        arr.addFirst(10);
        // or arr.add(0,10);
        // tine complexity
        // O(n) as all elements gets shifted to right side one by one

        // insert at any index position
        int pos=2;
        arr.add(pos,99); // insert at 2 position in the arr
        // it is very costly due to the element shifting

        // Delete Element

        // Delete last element
        arr.removeLast/*remove(arr.size()-1)*/();
        //O(1) time complexity

        // Delete by index

        int pos1=2;
        arr.remove(pos1);
        //O(n) because of shifting

        // Delete by value (first occurrence)

        int x=3;
        arr.remove(Integer.valueOf(x));
        // mandatory use of Integer.valueOf(x) to directly remove the value


        // Remove all occurrences of an element
        arr.add(78);
        arr.add(78);
        arr.add(78);
        arr.add(78);
        arr.add(78);
        System.out.println(arr);
        arr.removeIf(num->num==78);
        System.out.println(arr);
        // It is a clean and interview friendly approach

        // Update

        // update at index
        arr.set(2,100);
        System.out.println(arr);
        //O(1) time

        // update by value

        arr.add(45);
        arr.add(89);
        arr.add(456);
        arr.add(89);
        arr.add(89);

        for (int i=0; i<arr.size(); i++){
            if(arr.get(i)==89){
                arr.set(i,10);
            }
        }

        System.out.println(arr);
        // O(n) complexity

        // Rotation

        // left rotation by k
        int k=25;
        k= k %(arr.size());
        for (int i=1; i<=k; i++){
            int first= arr.getFirst();
            for (int j=1; j<arr.size(); j++){
                arr.set(j-1,arr.get(j));
            }
            arr.set(arr.size()-1,first);
        }
        System.out.println(arr);
        //O(n) time
        //O(1) space

        // right rotation by k1
        int k1=25;
        k1= k1 %(arr.size());
        for (int i=1; i<=k1; i++){
            int last= arr.getLast();
            for (int j=arr.size()-2; j>=0; j--){
                arr.set(j+1,arr.get(j));
            }
            arr.set(0,last);
        }
        System.out.println(arr);
        //O(n) time
        //O(1) space

        // using a reverse as a helper function

        // for left rotate
        int n=arr.size();
        int k2=25;
        k2= k2 %n;

        reverse(arr,0,k2-1);  // reverse first k elements
        reverse(arr,k2,n-1);    // reverse rest elements
        reverse(arr,0,n-1);  // reverse all now

        System.out.println(arr); // left rotation
        //O(n) time
        //O(1) space

        // for right rotation

        reverse(arr,0,n-1);  // reverse all first
        reverse(arr,0,k2-1); // reverse k elements then
        reverse(arr,k2,n-1);  // reverse the rest elements after k elements

        System.out.println(arr); // right rotation
        //O(n) time
        //O(1) space

        // removing all occurrences from an array no arraylist usage

        int[] arr2 = {1,2,3,2,4,2,5};
        int x1=2;
        int newLength=0;
        for (int i=0; i<arr2.length; i++){
            if (arr2[i]!=x1){
                arr2[newLength++]=arr2[i];
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(arr2,newLength)));

        // insert an element at a given position by shifting the rest
        int element=99;
        int pos2=2;
        int[] arr3 = {1,2,3,4,5,0};
        for (int i=arr3.length-1; i>pos2; i--){
            arr3[i]=arr3[i-1];
        }
        arr3[pos2]=element;
        System.out.println(Arrays.toString(arr3));

    }
}
