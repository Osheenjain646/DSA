package Lecture12;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // initialization of arraylist
        ArrayList<Integer> arrayList = new ArrayList<>();

        // ensuring the capacity of the arraylist
        arrayList.ensureCapacity(100);

        // adding element in the arraylist
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(20);

        // inserting new element in the middle of the arraylist using the index of the arraylist
        arrayList.add(1,12);

        // updating the element at specific index
        arrayList.set(0,7);

        // to access the element at specific index
        System.out.println(arrayList.get(1));

        // iterating over arraylist using for each loop
        for (Integer x: arrayList){
            System.out.print(x + " ");
        }

        System.out.println();

        // iterating over arraylist using for loop
        for (int i=0; i<arrayList.size() /*getting the size of the arraylist*/; i++){
            System.out.print(arrayList.get(i) + " ");
        }

    }
}
