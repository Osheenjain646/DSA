package Lecture12;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {

        // primitive data type
        int x = 5;

        // Integer class object type
        Integer y = 12;  // more powerful as it understand the behaviour

        // ArrayList only accept the object data type
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(x);   // Autoboxing the int data type into Integer object type
        arr.add(y);
        arr.add(45);
        arr.add(78);
        arr.add(69);
        arr.add(466);

        for (Integer i: arr){
            System.out.print(i + " ");
        }

        System.out.println();

        Integer z = 69;

        // remove functionality

        // using the index
        arr.remove(5);

        // using the object with value
        arr.remove(Integer.valueOf(45));
        arr.remove(z);

        for (Integer i: arr){
            System.out.print(i + " ");
        }

    }
}
