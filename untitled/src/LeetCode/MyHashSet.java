package LeetCode;

import java.util.ArrayList;

public class MyHashSet {
    ArrayList<Integer> arr;

    public MyHashSet() {
        arr = new ArrayList<>();
    }

    public void add(int key) {
        boolean ans = arr.contains(key);
        if (!ans) {
            arr.add(key);
        }
    }

    public void remove(int key) {
        if (arr.contains(key)) {
            arr.remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        return arr.contains(key);
    }
}


