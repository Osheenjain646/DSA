package Array;

import java.util.ArrayList;

public class What_Is_Array {
    public static void main(String[] args) {
        // It is a linear data structure
        // store same type of elements
        // have fixed indexed element (0-based)

        // eg:- int[] arr = {10,20,30,40,50};

        // Memory conceptually
        // |10|20|30|40|50|

        // =>  Static vs Dynamic Array

        // Static Array (Fixed Size)
        // size is fixed at creation time and size can't be change in future

        // eg:- int[] arr = new int[5];

        // problem is that extra space might be get waste


        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;
        arr[6] = 6;
        arr[7] = 7;
        arr[8] = 8;
        arr[9] = 9;

        // Dynamic Array (ArrayList)

        // Syntax

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
         // Dynamically adding the elements in the array
        // Runtime Resizing the array size
        // Have Built-in Methods
        // Safe memory Handling
        // interview friendly

        // Indexing have 0 based indexing

        // Access
        int x = arr[2];

        // O(1)

        // Update

        arr[1]=100;
        //O(1)

        // Traverse
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        //O(n)

        // Search
        // take the worst case every time to find out the best complexity

        for (int i=0; i<arr.length; i++){
            if (arr[i]==x){
                // return i;
            }
        }

        // n comparison

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i) + " ");
        }



    }
}
