package Lecture12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the arraylist: ");
        int size = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>(size);

        for (int i =0; i<size; i++){
            System.out.print("Element" + (i+1) + ": ");
            int num = sc.nextInt();
            arrayList.add(num);
        }

        // arraylist before deletion
        System.out.println("ArrayList before deletion: " + arrayList);

        System.out.println("Enter the position of the element to be deleted: ");
        int position = sc.nextInt();

        arrayList.remove((position-1));

        // printing after the deletion of the element
        System.out.println("ArrayList after deletion: " + arrayList);

        System.out.print("Enter the number whose all occurrences needed to be deleted from the left arraylist: ");
        int number = sc.nextInt();

        while (arrayList.contains(number)){
            arrayList.remove(Integer.valueOf(number));
        }

        // arraylist after all occurrence deletion of the number
        System.out.println("ArrayList after the deletion of all occurrences of " + number + ": " + arrayList);

    }
}
