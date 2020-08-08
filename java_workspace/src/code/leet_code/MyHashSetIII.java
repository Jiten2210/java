package code.leet_code;

import java.util.Arrays;

public class MyHashSetIII {

    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.remove(6);
        System.out.println(obj.contains(5));
    }
    int set[];

    /** Initialize your data structure here. */
    public MyHashSetIII() {
        set = new int[1000001];
        Arrays.fill(set, -1);
    }

    public void add(int key) {
        set[key] = key;
    }

    public void remove(int key) {
        set[key] = -1;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return set[key] != -1;
    }

}
