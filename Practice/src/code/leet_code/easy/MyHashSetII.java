package code.leet_code.easy;

import java.util.HashMap;
import java.util.Map;

public class MyHashSetII {

    public static void main(String[] args) {
        MyHashSetII obj = new MyHashSetII();
        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.remove(6);
        System.out.println(obj.contains(5));
    }

    Map<Integer, Integer> map;

    /**
     * Initialize your data structure here.
     */
    public MyHashSetII() {
        map = new HashMap<>();
    }

    public void add(int key) {
        map.put(key, 0);
    }

    public void remove(int key) {
        if (map.containsKey(key)) {
            map.remove(key);
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return map.containsKey(key);
    }
}

